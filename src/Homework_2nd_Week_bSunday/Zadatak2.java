package Homework_2nd_Week_bSunday;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {
    /* 2. Написати програм који налази други највећи број у низу.

            ● Низ бројева је 2,4,1,7,3,6;
            ● Програм налази други највећи број и исписује га на екран.

            Пример улаза и излаза.
                Улаз:
            низ 2,4,1,7,3,6
                Излаз:
            “Други највећи број је 6!”

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite niz: ");
        int[] niz = new int[6];
        int count = 0;
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
            count = i;
        }
        Arrays.sort(niz);
        System.out.println(Arrays.toString(niz));
        System.out.println("Drugi najveci broj je: ");
        System.out.println(niz[count- 1]);
    }
}
