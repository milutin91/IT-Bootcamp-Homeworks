package Homework_2nd_Week_aWednesday;

import java.util.Scanner;

public class Zadatak4 {
    /*
    4. Написати функцију која ИСПИСУЈЕ да ли је број мањи, једнак или већи од другог броја

        нпр:
        compareNums(5,4) -> Број је већи од другог броја
        compareNums(5,5) -> Број је исти као и други број
        compareNums(5,88) -> Број је мањи од другог броја

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite 1. broj: ");
        int num1 = sc.nextInt();
        System.out.println("Unesite 2. broj: ");
        int num2 = sc.nextInt();
        compareNums(num1, num2);

    }

    public static void compareNums(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Prvi broj je veci od drugog broja");
        } else if (num2 == num1) {
            System.out.println("Prvi broj je isti kao i drugi broj");
        } else {
            System.out.println("Prvi broj je manji od drugog broja");
        }
    }
}
