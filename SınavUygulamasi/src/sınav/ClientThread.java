package sınav;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

class Quiz {
    int quesNum = 0;
    int threadnum = 0;
    static String Soru, Secenek, Cevap;
    static boolean has_started = false;

    void sendQues(DataOutputStream dataOutputStream, int count) throws IOException, InterruptedException {
        threadnum++;
        if (threadnum < 3) {
            synchronized (this) {
                wait();
            }
        }
        if (!has_started) {
            if (Initiator.initiator()) { // her şey yolundaysa başlatıcıyı arayın
            	System.out.println("!! Sınav şu anda CANLI!!");
                System.out.println("-------------------------");
            }
            has_started = true;
        }
        dataOutputStream.writeUTF(Soru);
        dataOutputStream.writeUTF(Secenek);
        if (threadnum == 3)
            synchronized (this) {
                Cevap = reader.readAns();
                threadnum = 0;
                notifyAll();
            }
        TimeUnit.SECONDS.sleep(5);
    }

    int receiveAns(DataInputStream dataInputStream) throws IOException {
        String ans = dataInputStream.readUTF();
        if (ans.equals(Cevap))
            return 1;
        return 0;
    }
}

public class ClientThread extends Thread {
    static int count = 0, name_count = 0, total_ques = 0, time_per_ques = 0;
    final static Quiz quiz = new Quiz();
    static boolean isCevaping = false;
    String name;
    int port, score = 0;

    ClientThread(int port) {
        this.port = port;
    }

    public static void initialise(int total_ques, int time_per_ques) {
        ClientThread.total_ques = total_ques;
        ClientThread.time_per_ques = time_per_ques;
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            // connecting to Server..
            Socket socket = serverSocket.accept();
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            name = dataInputStream.readUTF();
            dataOutputStream.writeInt(total_ques);
            dataOutputStream.writeInt(time_per_ques);
            System.out.println(name + " Connected.");
            count++;

            while (quiz.quesNum < total_ques) {

                if (port == 1000) {
                    String[] list = reader.readQues();
                    // call readQues which reads Soru from generated file
                    quiz.Soru = list[0];
                    quiz.Secenek = list[1];
                } else {
                    Thread.sleep(1000);
                }
                quiz.sendQues(dataOutputStream, count);
                if (port == 1000)
                    isCevaping = true;
                score += quiz.receiveAns(dataInputStream);
                if (port == 1000) {
                    isCevaping = false;
                    count = 0;
                    quiz.quesNum++;
                } else {
                    if (quiz.quesNum == total_ques - 1 && isCevaping)
                        break;
                    Thread.sleep(500);
                }
            }
            serverSocket.close();
         // Katılımcıların puanlarını Toplantı Sahibi tarafında yazdırın
            System.out.println(name + "'s score: " + score);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
