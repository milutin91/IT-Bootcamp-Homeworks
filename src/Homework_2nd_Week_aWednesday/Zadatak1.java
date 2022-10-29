package Homework_2nd_Week_aWednesday;

import java.util.Scanner;

public class Zadatak1 {
    /*
        1. Написати функцију која проверава да ли је година преступна

            -Услови исти као прошле недеље
            -Уместо исписа, функција ВРАЋА truе или false

            нпр:
            isLeap(1900) -> false
            isLeap(1992) -> true
         */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu da proverite da li je prestupna ili ne: ");
        int inputYear = sc.nextInt();
        System.out.println(isLeap(inputYear));
    }
    public static boolean isLeap(int year) {
        return (year % 400 == 0 || year % 100 != 0) && year % 4 == 0;
    }
}
