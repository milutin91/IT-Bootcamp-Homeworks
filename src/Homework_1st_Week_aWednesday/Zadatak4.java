package Homework_1st_Week_aWednesday;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        /*
         4. Написати програм који исписује парне природне бројеве до унетог броја

            Природни бројеви су сви цели бројеви већи од 0 - {1,2,...}

            Пример1:
            Корисник уноси: 11
            Испис: 2,4,6,8,10
            Пример2:
            Корисник уноси: 8
            Испис: 2,4,6,8
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int num = sc.nextInt();

        // Prvi nacin:

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Drugi nacin:

        int i = 1;

        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
