package sınav;

import java.util.Scanner;

public class Main extends Host{
    public static void main(String[] args) {

        Host Host_obj = new Main();

        synchronized (Host_obj) {

            // konuyu seç
            Host_obj.subject();

            // soruları seç
            boolean Questions = Host_obj.questions();
            if (Questions) {
                System.out.println("Başarıyla seçildi " + question_setter.ques + " Sınav için sorular..");
            } else {
                System.out.println("!! Sorular seçilemiyor !!");
            }

        //  her soru için zaman seçin
            System.out.print("Her soru için süreyi (saniye cinsinden) girin : ");
            int time;
            Scanner scan = new Scanner(System.in);

            time = scan.nextInt();
            Host_obj.time(time);
            
            System.out.println("Katılımcıların bağlanması bekleniyor..");

            // Creating ClientThreads and connect to server.
            ClientThread.initialise(question_setter.ques, Set_time.t);
            ClientThread clientThread = new ClientThread(1000);
            ClientThread clientThread1 = new ClientThread(1001);
            ClientThread clientThread2 = new ClientThread(1002);

            clientThread.start();
            clientThread1.start();
            clientThread2.start();
        }
    }
}