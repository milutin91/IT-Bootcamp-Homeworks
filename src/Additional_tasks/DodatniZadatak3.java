package Additional_tasks;

import java.util.Scanner;

public class DodatniZadatak3 {
    public static void main(String[] args) {
        /*
        3. Написати програм који исписује следеће облике:

                Квадрат
                N = 4     N = 3

                ####      ###
                ####      ###
                ####      ###
                ####

                Правоугаоник
                a = 5 b = 4        a = 2 b = 6

                #####              ##
                #####              ##
                #####              ##
                #####              ##
                                   ##
                                   ##

                *Марио пирамида - Бонус задатак
                N = 5

                    # #
                   ## ##
                  ### ###
                 #### ####
                ##### #####
         */

//          KVADRAT

//        int n = 3;
//        for (int i = 1; i <= n; i++) {
//            for (int j =1; j <= n; j++) {
//                System.out.print("#");
//            }
//            System.out.print("\n");
//        }

        //PRAVOUGAONIK

//        int a = 5;
//        int b = 4;
//        for (int i = 1; i <= b; i++) {
//            for (int j =1; j <= a; j++) {
//                System.out.print("#");
//            }
//            System.out.print("\n");
//        }

        //MARIO PIRAMIDA
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj redova za piramidu: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.print(" ");
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
