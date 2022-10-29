package Homework_2nd_Week_bSunday;

import java.util.Scanner;

public class Zadatak1 {
    /* 1. Написати програм окреће реченицу наопако

            ● Корисник уноси са тастатуре стринг;
            ● Програм пролази кроз стринг и окреће стринг наопако.

            Пример улаза и излаза.
            Улаз:
                “This is Sparta!.”
            Излаз:
                “.!atrapS si sihT”

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite recenicu: ");
        String strInput = sc.nextLine();
        String result = "";
        for (int i = strInput.length() -1; i >= 0; i--) {
            result += strInput.charAt(i);
        }
        System.out.println(result);
    }
}
