package Homework_5th_Week_bSunday.Simple_Cash_Register;

import java.util.Scanner;

public class SingleProduct extends Product {

    public SingleProduct(String naziv, double cena) {
        super(naziv, cena);
    }

    public static SingleProduct create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv proizvoda: ");
        String naziv = sc.nextLine();
        System.out.println("Unesite cenu proizvoda: ");
        double cena = sc.nextDouble();
        return new SingleProduct(naziv, cena);
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
