package Homework_5th_Week_bSunday.Complex_Numbers;

// Complex Numbers

public class Main {
    public static void main(String[] args) {

        Complex z1 = new Complex(150, 200);
        Complex z2 = new Complex(15, 31);

        System.out.println("Z1 = " + z1);
        System.out.println("Z2 = " + z2);
        Complex z3 = z1.add(z2);
        System.out.println("Z1 + Z2 = " + z3);
        z3 = z1.subtract(z2);
        System.out.println("Z1 - Z2 = " + z3);
        z3 = z1.multiply(z2);
        System.out.println("Z1 * Z2 = " + z3);
        z3 = z1.divide(z2);
        System.out.println("Z1 / Z2 = " + z3);
    }
}
