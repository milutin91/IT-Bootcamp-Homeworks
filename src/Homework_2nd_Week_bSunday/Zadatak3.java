package Homework_2nd_Week_bSunday;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak3 {
    /* 3. Пребројати колико негативних бројева има у низу од локације1 до локације2.

            ● Корисник прави низ карактера у ком су измешани позитивни и негативни
                бројеви;
            ● Корисник уноси локацију1 и локацију2;
            ● Програм исписује колико негативних бројева имамо у низу од локације1
                до локације2.

            Пример улаза и излаза.
            Улаз:
                низ - 1,2,3,-6,-3,-2,5,8,-6,-2,-6
                “Локација1” - 2
                “Локација2” - 5
            Излаз:
                “Од индекса 2 до индеска 5 налазе се 3 негативна броја.”

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];
        System.out.println("Unesite brojeve niza: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Unesite 1. lokaciju: ");
        int loc1 = sc.nextInt();
        System.out.print("Unesite 2. lokaciju: ");
        int loc2 = sc.nextInt();
        int count = 0;
        for (int i = loc1; i <= loc2; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        if (count <= 4) {
            System.out.println("Od lokacije " + loc1 + " do lokacije " + loc2 + " ima " + count + " negativna broja.");
        } else System.out.println("Od lokacije " + loc1 + " do lokacije " + loc2 + " ima " + count + " negativnih brojeva.");
    }
}
