package Homework_5th_Week_bSunday.Simple_Cash_Register;

import java.util.Scanner;

public class WeightedProduct extends Product {
    private int gram;

    public WeightedProduct(String naziv, double cena, int gram) {
        super(naziv, cena);
        this.gram = gram;
    }

    public static WeightedProduct create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv proizvoda: ");
        String naziv = sc.nextLine();
        System.out.println("Unesite cenu 100g proizvoda: ");
        double cena = sc.nextDouble();
        System.out.println("Unesite gramazu proizvoda: ");
        int gram = sc.nextInt();
        return new WeightedProduct(naziv, cena, gram);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + gram + "g =" + getPrice() + "din\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() / 100 * gram;
    }
}
