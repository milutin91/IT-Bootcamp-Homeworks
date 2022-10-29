package Homework_5th_Week_bSunday.Simple_Cash_Register;

import java.util.Scanner;

public class SubscriptionService extends Service {
    private int month;

    public SubscriptionService(String naziv, double cena, int month) {
        super(naziv, cena);
        this.month = month;
    }

    public static SubscriptionService create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv pretplate: ");
        String naziv = sc.nextLine();
        System.out.println("Unesite cenu za 1 mesec pretplate: ");
        double cena = sc.nextDouble();
        System.out.println("Unesite broj meseci: ");
        int mesec = sc.nextInt();
        return new SubscriptionService(naziv, cena, mesec);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + month + " meseca =" + getPrice() + "din\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() * month;
    }
}
