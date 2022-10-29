package Homework_2nd_Week_aWednesday;

import java.util.Scanner;

public class Zadatak2 {
    /*
        2. Написати функцију која проверава да ли је троцифрен број Армстронгов или није

            -Враћа true или false
            -Број је Армстронгов ако је једнак збиру кубова његових цифара
            -нпр. 370 = 33 + 73 + 03 = 27 + 343 + 0 = 370

            нпр:
            isArmstrong(371) -> true
            isArmstrong(372) -> false
         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite trocifreni broj da proverite da li je Armstrongov ili ne: ");
        int numInput = sc.nextInt();
        System.out.println(isArmstrong(numInput));
    }

    public static boolean isArmstrong(int num) {
        int digit100 = num / 100;
        int digit10 = num % 100 / 10;
        int digit1 = num % 100 % 10;

        int sumPow = (int) (Math.pow(digit1, 3) + Math.pow(digit10, 3) + Math.pow(digit100, 3));

        return (num == sumPow);
    }
}
