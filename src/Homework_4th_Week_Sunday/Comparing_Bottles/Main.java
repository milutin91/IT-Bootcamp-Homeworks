package Homework_4th_Week_Sunday.Comparing_Bottles;

public class Main {

    public static void main(String[] args) {
        Boca b1 = new Boca(30.0);
        VinskaBoca v1 = new VinskaBoca(1.0, "Cabernet");
        RonilackaBoca rb1 = new RonilackaBoca(30.0, 9.9);

        System.out.println(b1 + "\n");
        System.out.println(v1 + "\n");
        System.out.println(rb1 + "\n");

        System.out.println("Identicnost boca: " + rb1.identicnostBoca(b1.zapremina));
        System.out.println("Identicnost boca: " + rb1.identicnostBoca(v1.zapremina));
    }
}
