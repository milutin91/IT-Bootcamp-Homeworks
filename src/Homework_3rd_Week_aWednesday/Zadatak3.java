package Homework_3rd_Week_aWednesday;

import java.util.ArrayList;
import java.util.Scanner;

/*
        3. //Napisite Java funkciju koja vraca nasumicni element iz
            ArrayListe koja se unosi pomocu skenera
 */
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strArrList = new ArrayList<String>();
        System.out.println("Unesite stringove u ArrayList-u (za prekid unesite \"0\"): ");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                strArrList.add(input);
            }
        }
        System.out.println(strArrList);
        System.out.println(randomElement(strArrList));
    }
    public static String randomElement (ArrayList<String> arrList) {

        return arrList.get((int) (Math.random() * arrList.size()));
    }
}
