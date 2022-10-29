package Homework_1st_Week_aWednesday;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
        2. Написати програм који за унету годину проверава да ли је преступна

            Година је преступна ако испуњава следеће:
            Година је дељива са 4
            Година је дељива са 400 или година није дељива са 100

            Унесите годину коју желите да проверите:
            1900
            Година није преступна

            Унесите годину коју желите да проверите:
            1992
            Година јесте преступна
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu koju zelite da proverite: ");
        int unos = sc.nextInt();

        if (unos % 4 == 0 && (unos % 400 == 0 || unos % 100 != 0)) {
            System.out.println("Godina je prestupna!");
        }  else {
            System.out.println("Godina nije prestupna!");
        }
    }
}
