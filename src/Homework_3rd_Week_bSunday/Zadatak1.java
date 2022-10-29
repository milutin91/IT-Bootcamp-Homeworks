package Homework_3rd_Week_bSunday;
//  1. Написати функцију која прима матрицу (2Д низ) и враћа највећи ред (по збиру)

//          -Hint: Сетите се како смо радили највећи елемент низа

//          int[][] matrix = { { 3, 2, 1, 7 },
//                             { 9, 11, 5, 4 },
//                             { 6, 0, 13, 17 },
//                             { 7, 21, 14, 15 } };
//
//          largestRow(matrix); // Враћа - [7, 21, 14, 15]

import java.util.ArrayList;
import java.util.Scanner;


public class Zadatak1 {

    public static ArrayList<Integer> largestRow(int[][] matrix) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int sumTemp = 0;
        int rowMaxSum = 0;
        int largestRow = 0;
        int j = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                sumTemp += matrix[i][j];
            }
            if (sumTemp > rowMaxSum) {
                largestRow = i;
                rowMaxSum = sumTemp;
            }
            sumTemp = 0;
        }
        for (int k = 0; k <= j - 1; k++) {
            arrayList.add(matrix[largestRow][k]);
        }


        return arrayList;
    }
//    Funkcija koja vraca red sa najvecim zbirom elemenata

//    public static ArrayList<Integer> largestRow(int[][] matrix) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        int sumTemp = 0;
//        int rowMaxSum = 0;
//        int largestRow = 0;
//        int j = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (j = 0; j < matrix[i].length; j++) {
//                sumTemp += matrix[i][j];
//            }
//            if (sumTemp > rowMaxSum) {
//                largestRow = i;
//                rowMaxSum = sumTemp;
//            }
//            sumTemp = 0;
//        }
//        for (int k = 0; k <= j - 1; k++) {
//            arrayList.add(matrix[largestRow][k]);
//        }
//
//
//        return arrayList;
//    }

//    Funkcija pomocu koje se pravi i vraca matrica

    public static int[][] matrixEntry() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj redova: ");
        int n = sc.nextInt();
        System.out.println("Unesite broj kolona: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Unesite brojeve matrice: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void main(String[] args) {

        System.out.println("Red sa najvecim zbirom elemenata je: " + largestRow(matrixEntry()));
    }
}

