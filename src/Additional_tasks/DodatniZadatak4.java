package Additional_tasks;

import java.util.Scanner;

public class DodatniZadatak4 {
    public static void main(String[] args) {

        /*
        4. Написати програм који исписује природне бројеве до унетог броја на сл. начин

            Ако је број дељив са 3 - Исписујемо Fizz
            Ако је број дељив са 5 - Исписујемо Buzz
            Ако је број дељив са 3 и са 5 - Исписујемо FizzBuzz
            Ако није испуњен ни један услов изнад - Исписујемо тај број
            Пример тока програма:

            Унесите број: 15
            1
            2
            Fizz
            4
            Buzz
            Fizz
            7
            8
            Fizz
            Buzz
            11
            Fizz
            13
            14
            FizzBuzz
         */

        Scanner sc = new Scanner(System.in);
        int unos = sc.nextInt();
        String str1 = "Fizz";
        String str2 = "Buzz";
        String str3 = "FizzBuzz";
        int count = 0;
        for (int i = 1; i <= unos; i++) {
            count += 1;
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println(str3);
            } else if (count % 5 == 0) {
                System.out.println(str2);
            } else if (count % 3 == 0) {
                System.out.println(str1);
            } else {
                System.out.println(count);
            }
        }
    }
}
