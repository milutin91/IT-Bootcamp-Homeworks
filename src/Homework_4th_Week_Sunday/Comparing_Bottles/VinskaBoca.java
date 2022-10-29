package Homework_4th_Week_Sunday.Comparing_Bottles;

public class VinskaBoca extends Boca {
    String nazivVina;

    VinskaBoca(double zapremina, String nazivVina) {
        super(zapremina);
        this.nazivVina = nazivVina;
    }

    public String getNazivVina() {
        return nazivVina;
    }

    public void setNazivVina(String nazivVina) {
        this.nazivVina = nazivVina;
    }

    @Override
    public String toString() {
        return "Naziv vina: " + nazivVina + "\n" + super.toString();
    }
}
