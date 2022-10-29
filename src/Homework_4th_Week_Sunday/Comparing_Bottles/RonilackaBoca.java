package Homework_4th_Week_Sunday.Comparing_Bottles;

public class RonilackaBoca extends Boca {
    double masa;

    RonilackaBoca(double zapremina, double masa) {
        super(zapremina);
        this.masa = masa;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    @Override
    public String toString() {
        return "Masa ronilacke boce: " + masa + "kg\n" + super.toString();
    }
}
