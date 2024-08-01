package sınav;

class Set_time extends Thread {

   static protected int t;

   static void set(int time) {
      System.out.println("Katılımcıların her soruyu cevaplamaları gerekmektedir. " + time + " saniye");

      t = time;

   }

}
