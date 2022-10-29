package Homework_1st_Week_bSunday;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        1. Написати програм који броји кораке корисника:
//          ● Корисник се шета помоћу тастера (w-горе, a- лево, s-доле, d-десно);
//          ● Програм памти колико је корисник пута ишао горе, лево, доле и десно;
//          ● Програм се зауставља ако корисник унесе било који карактер сем
//              (w,s,a,d);
//          ● На крају програм исписује број корисникових корака ка свим странама.
//
//          Пример улаза и излаза.
//          Улаз:
//                w
//                w
//                s
//                a
//                a
//                d
//                x
//          Излаз:
//                “Корисник је прошао 2 корака на горе, 1 корак на доле, 2 корака лево и 1
//                 корак десно”

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite gde zelite da idete - \"W\" za gore, \"A\" za levo, \"S\" za dole i \"D\" za desno.");

        int countW = 0;
        int countA = 0;
        int countS = 0;
        int countD = 0;

        boolean condition = true;
        while (condition) {

            //U slucaju da korisnik unese veliko slovo iskoristio sam toLowerCase(Locale.ROOT).

            char input = sc.next().toLowerCase().charAt(0);
            switch (input) {
                case 'w':
                    countW += 1;
                    break;
                case 'a':
                    countA += 1;
                    break;
                case 's':
                    countS += 1;
                    break;
                case 'd':
                    countD += 1;
                    break;
                default:
                    condition = false;
                    System.out.println("Program je prekinut!\n");
            }
        }
        System.out.println("Isli ste: \n" + countW + " koraka gore, \n" + countA + " koraka levo, \n" + countS + " koraka dole, \n" + countD + " koraka desno.");
    }
}