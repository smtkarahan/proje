package sınav;

import java.io.*;
import java.util.Scanner;

public class reader {

    static int currentQues = 0;
    static FileInputStream fis1 = null, fis2 = null;
    static Scanner sc1 = null, sc2 = null;

  //Soru.txt dosyasındaki soruları okur ve bir soruyu ve onun seçeneğini döndürür
    static String[] readQues() throws FileNotFoundException {
        if (currentQues == 0) {
            fis1 = new FileInputStream("Questions.txt");
            sc1 = new Scanner(fis1);
        }
        String[] list = new String[2];
        list[0] = sc1.nextLine();
        list[1] = sc1.nextLine();
        currentQues++;
        return list;
    }

  //Seçilen sorunun cevabını AnswerKey.txt dosyasından okur ve doğru seçeneği döndürür
    static String readAns() throws FileNotFoundException {
        if (currentQues == 1) {
            fis2 = new FileInputStream("AnswerKey.txt");
            sc2 = new Scanner(fis2);
        }
        String ans = sc2.nextLine();
        return ans;
    }
}