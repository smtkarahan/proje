package sınav;

import java.util.Timer;
import java.util.TimerTask;
import java.io.*;

public class timer {
    private String str = "", str2 = "";
    BufferedReader in;
    Timer timer = new Timer();
    boolean hasRun = false;

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            hasRun = true;
            if (str.equals("")) {
                System.out.println("hiçbir şey girmemiştin. Sonraki soruya geçmek için 'Enter' tuşuna basın.");
                System.out.println("------------------------------------------");
            }
            timer.cancel();
        }
    };

    public String getInput(int seconds) throws IOException {
        timer.schedule(task, seconds * 1000);
        System.out.println("İçinde cevap ver " + seconds + " saniye: ");
        System.out.print("Cevabınız : ");
        in = new BufferedReader(new InputStreamReader(System.in));
        str2 = in.readLine();
        if (!hasRun) {
            timer.cancel();
            str = str2;
        }
        System.out.println("------------------------------------------");
        return str;
    }

}