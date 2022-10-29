package Homework_1st_Week_bSunday;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        3*. Програм креира скривени број од 0 до 100, користик има на располагању
            максимално 10 корака да пронађе скривени број, програм, након сваког унетог
            покушаја исписује да ли је скривени број “мањи” или “већи” од унетог броја,
            ако је број исти исписује “Браво! Пронашли сте број!” и програм се завршава.

                ● Програм креира насумичан (random) број од 0 до 100,помоћ - (int)
                (Math.random() * 100); користимо класу Math са методом random() која
                нам даје број између 0 и 1 (нпр. 0,20 ; 0,72 ...) множимо са 100 да би
                направили број од 0 до 100;

                ● Ако је број који је корисник унео једнак броју креираном од стране
                рачунара исписати “Браво! Пронашли сте број!” и програм се прекида;
                ● Након 10 покушаја програм се зауставља.

                Пример улаза и излаза.
                Улаз:
                    нпр. рачунар изабере број 13 који се налзи између 0 и 100
                    корисник уноси бројеве:
                улаз - 50
                излаз - мањи
                траг - “сада знамо да је скривени број између 0 и 50”
                улаз - 25
                излаз - мањи
                траг - “сада знамо да је скривени број између 0 и 25”
                улаз - 13
                Излаз - “Браво! Пронашли сте број!”
         */

        // PRVI NACIN sa ukljucenim "tragom"

        int rndmNum = (int) (Math.random() * 100);

        // Dodeljujemo nove vrednosti kako bismo znali novi min ili max.
        int max = 100; // max = myNum;
        int min = 0;   // min = myNum;

        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Pogodite skriveni broj od 0 do 100! Imate 10 pokusaja.");
        for (i = 1; i <= 10; i++) {
            System.out.println("Pokusaj br " + i + ":");
            int myNum = sc.nextInt();
            if (myNum == rndmNum) {
                System.out.println("CESTITAMO!!! Pogodili ste broj :D");
                break;
            } else if (myNum < rndmNum) {
                min = myNum;
                System.out.println("Skriveni broj je veci, i nalazi se izmedju " + min + " i " + max + ".");
            } else {
                max = myNum;
                System.out.println("Skriveni broj je manji, i nalazi se izmedju " + min + " i " + max + ".");
            }
        }
        if (i > 10) {
            System.out.println("Nazalost niste pogodili skriveni broj. Skriveni broj je " + rndmNum);
        }


        // DRUGI NACIN - bez "traga"

//        int rndmNum = (int) (Math.random() * 100);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Pogodite skriveni broj od 0 do 100! Imate 10 pokusaja.");
//        int i;
//        for (i = 1; i <= 10; i++) {
//            System.out.println("Pokusaj br " + i + ":");
//            int myNum = sc.nextInt();
//            if (myNum == rndmNum) {
//                System.out.println("CESTITAMO!!! Pogodili ste broj :D");
//                break;
//            } else if (myNum < rndmNum) {
//                System.out.println("Skriveni broj je veci od unetog!");
//            } else {
//                System.out.println("Skriveni broj je manji od unetog!");
//            }
//        }
//        if (i > 10) {
//            System.out.println("Nazalost niste pogodili skriveni broj. Skriveni broj je " + rndmNum);
//        }
    }
}
