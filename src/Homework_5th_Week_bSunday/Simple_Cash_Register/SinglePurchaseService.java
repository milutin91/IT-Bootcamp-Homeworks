package Homework_5th_Week_bSunday.Simple_Cash_Register;

import java.util.Scanner;

public class SinglePurchaseService extends Service {

    public SinglePurchaseService(String naziv, double cena) {
        super(naziv, cena);
    }

    public static SinglePurchaseService create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv pretplate: ");
        String naziv = sc.next();
        System.out.println("Unesite cenu pretplate: ");
        double cena = sc.nextDouble();
        return new SinglePurchaseService(naziv, cena);
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
