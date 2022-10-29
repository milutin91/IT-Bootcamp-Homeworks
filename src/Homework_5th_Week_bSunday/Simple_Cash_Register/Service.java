package Homework_5th_Week_bSunday.Simple_Cash_Register;

public abstract class Service implements Priceable {

    private String naziv;
    private double cena;

    public Service(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return naziv + " - " + cena + "din";
    }

    @Override
    public double getPrice() {
        return cena;
    }
}
