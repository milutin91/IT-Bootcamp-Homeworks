package Homework_2nd_Week_aWednesday;

import java.util.Scanner;

public class Zadatak3 {
    /*
        3. (БОНУС) Проширити задатак са Армстронговим бројевима на СВЕ бројеве

        -Број је Армстронгов ако је једнак збиру n-тих степена његових цифара
            *Где је n број цифара тог броја
        -https://mathworld.wolfram.com/NarcissisticNumber.html

        нпр:
        isArmstrong(371) -> true
        isArmstrong(5) -> true (51 = 5)
        isArmstrong(1634) -> true (јер 14 + 64 + 34 + 44 = 1634)
        isArmstrong(1625) -> false

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj za proveru Armstrongovog broja: ");
        int numInput = sc.nextInt();

        System.out.println(isArmstrong(numInput, numberOfDigits(numInput)));                //---> prvi nacin
        System.out.println(isArmstrong(numInput));                                          //---> drugi nacin
    }
    // U ovoj funkciji proveravamo koliko cifara ima broj, parametar je interger koji uzimamo sa skenera u main metodi.

    public static int numberOfDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

                                        // PRVI NACIN

    /* U ovoj funkciji proveravamo da li je broj Armstrongov. Prvi parametar je int koji uzimamo sa skenera
       u main metodi, a drugi parametar je int funkcija numberOfDigits() koja nam vraca koliko cifara ima broj */

    public static boolean isArmstrong(int num1, int num2) {
        int sum = 0;
        String strNum = String.valueOf(num1);                                   //---> ovde smo broj pretvorili u string
        for (int i = 0; i < strNum.length(); i++) {                             //---> proveravamo duzinu stringa (prakticno broj cifara)
            int temp = Character.getNumericValue(strNum.charAt(i));             /* ---> u svakoj iteraciji, na odredjenoj poziciji
                                                                                        dobijamo karakter koji pomocu
                                                                                        Character.getNumericValue() pretvaramo u int,
                                                                                        i temp se menja. Npr. ako smo uneli broj 1634,
                                                                                        u prvom krugu temp = 1, u drugom temp = 6,
                                                                                        u trecem temp = 3 i u cetvrtom temp = 4 */

            sum += Math.pow(temp, num2);                                        // Ovde racunamo zbir za proveru Armstrongovog broja.
        }
        return (num1 == sum);
    }

                                         // DRUGI NACIN

    /* Ovo je ista funkcij ali koristi samo jedan parametar(sada za broj cifara u broju koristim brojac, a ne posebnu
       funkciju kao u prethodnom primeru) */

    public static boolean isArmstrong(int num1) {
        int sum = 0;
        int count = 0;
        String strNum = String.valueOf(num1);
        for (int i = 0; i < strNum.length(); i++) {
            count++;                                        /* ------> BROJAC (da sam brojac stavio u petlju ispod, stepen bi se menjao u
                                                                         svakoj iteraciji - bio bi 1, 2, 3...) */
        }
        for (int i = 0; i < strNum.length(); i++) {
            int temp = Character.getNumericValue(strNum.charAt(i));
            sum += Math.pow(temp, count);
        }
        return (num1 == sum);
    }
}