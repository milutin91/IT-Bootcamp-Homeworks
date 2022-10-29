package Homework_4th_Week_Sunday.Simple_Book_Library;

public class Knjiga {
    String naziv;
    int godina;
    boolean dostupna = true;

    public Knjiga(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    void izdajKnjigu() {
        dostupna = false;
    }

    void vratiKnjigu() {
        dostupna = true;
    }

    @Override
    public String toString() {
        return "Naziv: " + naziv + "\n" +
                "Godina: " + godina + "\n" +
                "Dostupna: " + dostupna + "\n\n";
    }
}
