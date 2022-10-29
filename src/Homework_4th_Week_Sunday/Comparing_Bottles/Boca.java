package Homework_4th_Week_Sunday.Comparing_Bottles;

public class Boca {
    double zapremina;

    Boca() {

    }

    Boca(double zapremina) {
        this.zapremina = zapremina;
    }

    public void setZapremina(double zapremina) {
        this.zapremina = zapremina;
    }

    public double getZapremina() {
        return zapremina;
    }

    boolean identicnostBoca(double zapremina) {
        return this.zapremina == zapremina;
    }

    @Override
    public String toString() {
        return "Zapremina boce: " + zapremina + "L";
    }
}
