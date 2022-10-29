package Homework_1st_Week_aWednesday;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        3. Корисник уноси троцифрен број: (претпоставити добар унос)

            1. Извући цифре броја и исписати их кориснику
            2. Проверити и исписати да ли је број Армстронгов
            Број је Армстронгов ако је једнак збиру кубова његових цифара
            нпр. 370 = 33 + 73 + 03 = 27 + 343 + 0 = 370

            Унесите троцифрен број:
            370
            Цифра стотине је: 3
            Цифра десетице је: 7
            Цифра јединице је: 0
            Број јесте Армстронгов
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite trocifren broj: ");

        int num = sc.nextInt();
        int testNum = num;
        int num100 = testNum / 100;
        testNum %= 100;
        int num10 = testNum / 10;
        int num1 = testNum % 10;
        System.out.println("Cifra stotine je: " + num100);
        System.out.println("Cifra desetice je: " + num10);
        System.out.println("Cifra jedinice je: " + num1);


        int sumPow = (num100 * num100 * num100) + (num10 * num10 * num10) + (num1 * num1 * num1);
        //int sumPow = (int) (Math.pow(num100, 3) + Math.pow(num10, 3) + Math.pow(num1, 3));
        if (sumPow == num) {
            System.out.println("Ovo je Armstrongov broj!");
        }   else {
            System.out.println("Nije Armstrongov broj!");
        }
    }
}
