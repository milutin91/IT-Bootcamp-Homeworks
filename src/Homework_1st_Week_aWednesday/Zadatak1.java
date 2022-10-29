package Homework_1st_Week_aWednesday;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*

        1. Корисник уноси два реална броја

            1. Исписати да ли је производ ова два броја позитиван
            2. Исписати да ли је збир ова два броја већи од 150
            3. Исписати који је већи од ова два броја

            Напомена: Водити рачуна да ли је . или ,
                    За исписе true/false користити boolean, а не String
            Унесите два реална броја:
            4.5 6.3
            true
            false
            6.3

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dva realna broja: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean rezultat = true;

        if (x * y > 0) {
            System.out.println(rezultat);
        } else {
            System.out.println(!rezultat);
        }

        if (x + y > 150) {
            System.out.println(rezultat);
        } else {
            System.out.println(!rezultat);
        }
        // Prvi nacin
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
        // Drugi nacin
        //System.out.println(Math.max(x, y));
        //asdasdasd
    }
}
