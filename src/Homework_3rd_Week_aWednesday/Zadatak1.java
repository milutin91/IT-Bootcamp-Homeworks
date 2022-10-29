package Homework_3rd_Week_aWednesday;

import java.util.ArrayList;
import java.util.Scanner;

/*

    1.    //Napisite Java program za brojanje stringova u kojima je duzina
            stringa 2 ili vise, a prvi i poslednji znak isti sa date liste stringova.

          //Stringove uneti sa tastature pomocu skenera i unabici u
            ArrayList strukturu podataka

          // Potrebno je napraviti funkciju

          //ArrayList : ['abc', 'xyz', 'aba', '1221']

          //Expected Result : 2

     */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrList = new ArrayList<String>();
        System.out.println("Unesite stringove u AL: ");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("stop")) {
                break;
            } else {
                arrList.add(input);
            }
        }
        System.out.println(arrList);
        System.out.println(countOfStrings(arrList));
    }

    public static int countOfStrings(ArrayList<String> arr) {
        int count = 0;
        for (String arrElement : arr) {
            if (arrElement.charAt(0) == arrElement.charAt(arrElement.length() - 1) && arrElement.length() >= 2) {
                count++;
            }
        }
        return count;
    }
}
