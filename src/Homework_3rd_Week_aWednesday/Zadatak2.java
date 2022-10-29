package Homework_3rd_Week_aWednesday;

/*  
     //Napisite Java funkciju koja uzima dva niza i vraca True ako
        imaju bar jednog zajednickog clana
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList<Integer> niz1 = new ArrayList<Integer>();
        ArrayList<Integer> niz2 = new ArrayList<Integer>();

        System.out.println("Unesite brojeve 1. AL (za prekid unesite \"STOP\" ): ");
        creatingAL(niz1);
        System.out.println("Unesite brojeve 2. AL (za prekid unesite \"STOP\" ): ");
        creatingAL(niz2);

        System.out.println("Elementi 1. Array liste: " + niz1);
        System.out.println("Elementi 2. Array liste: " + niz2);

        System.out.println(mutualElement(niz1, niz2));

    }
//  Funkcija za koja proverava da li postoji zajednicki element.
    public static boolean mutualElement(ArrayList<Integer> al1, ArrayList<Integer> al2) {
        for(int el1 : al1) {
            for (int el2 : al2) {
                if (el1 == el2) {
                    return true;
                }
            }
        }
        return false;
    }

//  Funkcija za kreiranje ArrayList-e.
    public static void creatingAL (ArrayList<Integer> al) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            } else {
                al.add(Integer.parseInt(input));
            }
        }
    }
}
