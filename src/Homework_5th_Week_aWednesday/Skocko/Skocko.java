package Homework_5th_Week_aWednesday.Skocko;

public class Skocko {
    private final int maxBrPokusaja;
    private int brPokusaja;
    private KombinacijaZnakova trazenaKombinacija;
    private KombinacijaZnakova trenutnaKombinacija;

    public Skocko(int maxBrPokusaja, int brPokusaja, KombinacijaZnakova trazenaKombinacija, KombinacijaZnakova trenutnaKombinacija) {
        this.maxBrPokusaja = maxBrPokusaja;
        this.brPokusaja = brPokusaja;
        this.trazenaKombinacija = trazenaKombinacija;
        this.trenutnaKombinacija = trenutnaKombinacija;
    }

    public int getBrPokusaja() {
        return brPokusaja;
    }

    public void setBrPokusaja(int brPokusaja) {
        this.brPokusaja = brPokusaja;
    }

    public KombinacijaZnakova getTrazenaKombinacija() {
        return trazenaKombinacija;
    }

    public void setTrazenaKombinacija(KombinacijaZnakova trazenaKombinacija) {
        this.trazenaKombinacija = trazenaKombinacija;
    }

    public KombinacijaZnakova getTrenutnaKombinacija() {
        return trenutnaKombinacija;
    }

    public void setTrenutnaKombinacija(KombinacijaZnakova trenutnaKombinacija) {
        this.trenutnaKombinacija = trenutnaKombinacija;
    }

    // Конструктор

    public void pokusaj() {
        brPokusaja++;
        System.out.println("Pokusaj br " + brPokusaja);
        trenutnaKombinacija.setKombinacija();
//        System.out.println(trenutnaKombinacija.getKombinacija());
        trenutnaKombinacija.porediKombinacije(trazenaKombinacija);

    }

    // boolean isGameOver()
    public boolean jeGotova() {
        if (trenutnaKombinacija.equals(trazenaKombinacija)) {
            System.out.println("CESTITAMO!!! Pogodili ste kombinaciju!");
            return true;
        } else if (brPokusaja >= maxBrPokusaja) {
            System.out.println("Trazena kombinacija je " + trazenaKombinacija.getKombinacija() + "\nGAME OVER!!!");
            return true;
        } else {
            return false;
        }
    }
}
