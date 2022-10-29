package Homework_5th_Week_bSunday.Simple_Cash_Register;

public abstract class Product implements Priceable {

    private String naziv;
    private double cena;

    public Product(String naziv, double cena) {
        this.cena = cena;
        this.naziv = naziv;
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
