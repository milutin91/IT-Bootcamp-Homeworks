package Additional_tasks;

import java.util.Scanner;

public class DodatniZadatak1 {
    public static void main(String[] args) {
        /*
        1. Написати збир целих бројева од N до M (Укључујући оба)

            N и M се уносе са тастатуре
            Напомена: N може бити и мање од M, видети Пример2
            Пример1:
            Корисник уноси: 5 11
            Испис: 56  (5 + 6 + 7 + 8 + 9 + 10 + 11)

            Пример2:
            Корисник уноси: 11 8
            Испис: 38  (8 + 9 + 10 + 11)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dva broja: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;


        for (int i = n; i <= m; i++) {
            sum += i;
        }
        for (int i = m; i <= n; i++) {
            sum += i;
        }
        if (n <= m) {
            System.out.println("Zbir niza od " + n + " do " + m + " je " + sum);
        } else {
            System.out.println("Zbir niza od " + m + " do " + n + " je " + sum);
        }

    }
}
