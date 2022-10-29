package Additional_tasks;

import java.util.Scanner;

public class DodatniZadatak2 {
    public static void main(String[] args) {
        /*
         2. Написати програм који исписује збир свих унетих бројева док се не унесе 0

            Напомена: Није неопходан детаљан испис као испод, али је пожељан
            Пример тока програма:

            Унесите број: 5
            Збир је: 5 , Унесите следећи број или 0 да изађете из програма: 3
            Збир је: 8 , Унесите следећи број или 0 да изађете из програма: -7
            Збир је: 1 , Унесите следећи број или 0 да изађете из програма: 0

            Укупан збир је 1
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int choice = sc.nextInt();
        int sum = 0;
        sum += choice;

        while (choice != 0) {
            System.out.print("Zbir je: " + sum + ", unesite sledeci broj ili 0 da izadjete iz programa: ");
            choice = sc.nextInt();
            sum += choice;
            if (choice == 0) {
                System.out.print("Ukupan zbir je: " + sum);
                break;
            }
        }

    }
}
