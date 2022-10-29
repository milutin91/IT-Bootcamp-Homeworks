package Homework_5th_Week_bSunday.Simple_Cash_Register;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> racun = new ArrayList<>();
        System.out.println("""
                ---KASA---
                                
                Izaberite:
                                
                1 - Na Meru
                2 - Na Komad
                3 - Jednokratna usluga
                4 - Pretplata za uslugu
                0 - EXIT""");

        double sum = 0;
        int izbor = sc.nextInt();
        boolean prekidac = true;
        while (prekidac) {

            switch (izbor) {
                case 0 -> {
                    System.out.println("KRAJ");
                    prekidac = false;
                }
                case 1 -> {
                    Product wp = WeightedProduct.create();
                    racun.add(wp.toString());
                    sum += wp.getPrice();
                    System.out.println("\nIzaberite kategoriju ponovo");
                    izbor = sc.nextInt();
                }
                case 2 -> {
                    Product sp = SingleProduct.create();
                    racun.add(sp.toString());
                    sum += sp.getPrice();
                    System.out.println("\nIzaberite kategoriju ponovo");
                    izbor = sc.nextInt();
                }
                case 3 -> {
                    Service ss = SubscriptionService.create();
                    racun.add(ss.toString());
                    sum += ss.getPrice();
                    System.out.println("\nIzaberite kategoriju ponovo");
                    izbor = sc.nextInt();
                }
                case 4 -> {
                    Service sps = SinglePurchaseService.create();
                    racun.add(sps.toString());
                    sum += sps.getPrice();
                    System.out.println("\nIzaberite kategoriju ponovo");
                    izbor = sc.nextInt();
                }
                default -> {
                    System.out.println("\nNepostojeci izbor! Izaberite ponovo: ");
                    izbor = sc.nextInt();
                }
            }
        }
        String racunFormat = racun.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "");
        System.out.println("Vas racun je: \n" + racunFormat + "\nUkupno " + sum);
    }
}
