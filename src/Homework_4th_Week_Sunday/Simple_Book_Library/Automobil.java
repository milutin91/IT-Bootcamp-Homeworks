package Homework_4th_Week_Sunday.Simple_Book_Library;

public class Automobil {
    String naziv;
    int godProizvodnje;
    boolean startovan;

    Automobil() {

    }

    Automobil(String naziv, int godProizvodnje) {
        this.naziv = naziv;
        this.godProizvodnje = godProizvodnje;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodProizvodnje() {
        return godProizvodnje;
    }

    public void setGodProizvodnje(int godProizvodnje) {
        this.godProizvodnje = godProizvodnje;
    }

    void startEngine() {
        startovan = true;
    }

    void stopEngine() {
        startovan = false;
    }

    @Override
    public String toString() {
        if (startovan) {
            return naziv + " WRRRROOOOOMM!";
        } else {
            return naziv + " Startujte motor!";
        }
    }
}
