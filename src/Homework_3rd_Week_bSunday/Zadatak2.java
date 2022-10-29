package Homework_3rd_Week_bSunday;
//  2. Написати програм који највећу (по збиру) колону, ставља на прво место

//              int[][] matrix = { { 3, 2, 1, 7 },
//                                 { 9, 11, 5, 4 },
//                                 { 6, 0, 13, 17 },
//                                 { 7, 21, 14, 15 } };
//
////                             ... Овде иде ваша магија
//
//              int[][] result = { { 7, 3, 2, 1 },
//                                 { 4, 9, 11, 5 },
//                                 { 17, 6, 0, 13 },
//                                 { 15, 7, 21, 14 } };

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {

//    Funkcija koja vraca index kolone ciji je zbir najveci

    public static int numOfLargestColumn(int[][] matrix) {
        int sumTemp = 0;
        int count = 0;
        int sumColMax = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumTemp += matrix[j][i];
            }
            if (sumTemp > sumColMax) {
                sumColMax = sumTemp;
                count = i;
            }
            sumTemp = 0;
        }
        return count;

    }

//    Funkcija koja vraca preuredjenu matricu (kolona sa najvecim zbirom na prvom mestu)

    public static int[][] largestCol(int[][] matrix, int numOfCol) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < numOfCol; j++) {
                int temp = matrix[i][numOfCol];
                matrix[i][numOfCol] = matrix[i][j];
                matrix[i][j] = temp;
                }
            }
            return matrix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu matrice ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Unesite brojeve matrice: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Pocetna matrica je: ");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("Preuredjena matrica je: ");
        System.out.println(Arrays.deepToString(largestCol(matrix, numOfLargestColumn(matrix))));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
