package Homework_1st_Week_bSunday;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        /*
        2. Корисник може унети n бројева са тастатуре, програм се зауставља када
           користин напише команду “stop”:

                ● Програм проверава сваки унос корисника (сваки број који корисник
                унесе);
                ● Ако је број који је корисник унео дељив са 2, програм исписује “Broj je
                deljiv sa 2”;
                ● Ако број није дељив са 2, програм исписује “Broj nije deljiv sa 2”.

                Пример улаза и излаза.
                Улаз:
                    нпр. користик уноси 3 броја: 33, 20, 26, “stop”
                Излаз:
                    “Broj nije deljiv sa 2”
                    “Broj je deljiv sa 2”
                    “Broj je deljiv sa 2”
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite brojeve za testiranje, ili STOP za prekid programa!");
        if (sc.hasNextInt()) {
            while (sc.hasNextInt()) {
                int numInput = sc.nextInt();
                if (numInput % 2 == 0) {
                    System.out.println("Broj je deljiv sa 2.");
                } else {
                    System.out.println("Broj nije deljiv sa 2");
                }
            }
        }
        if (sc.hasNext()) {
            while (sc.hasNext()) {
                String strInput = sc.next();
                if (strInput.toLowerCase().equals("stop")) {
                    System.out.println("Program je prekinut!");
                    break;
                } else {
                    System.out.println("Nije validan unos!"); //Program se nece prekinuti dok ne unesemo "stop".
                }
            }
        }
    }
}





