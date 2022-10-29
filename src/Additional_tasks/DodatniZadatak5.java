package Additional_tasks;

import java.util.Scanner;

// 3. Написати функцију која проверава да ли је Стринг палиндром
public class DodatniZadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki string da proverite da li je palindrom: ");
        String strInput = sc.nextLine();
        System.out.println(palindrom(strInput));
    }
    public static boolean palindrom (String str) {
        String strBack = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
             String strChar = String.valueOf(str.charAt(i));
             strBack += strChar;
        }
        return str.equals(strBack);
    }
}
