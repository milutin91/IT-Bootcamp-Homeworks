package Homework_5th_Week_aWednesday.Skocko;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class KombinacijaZnakova {
    private final int velicina;
    private final ArrayList<String> kombinacija;


    // Конструктор који прима величину

    public KombinacijaZnakova(int velicina) {
        this.velicina = velicina;
        kombinacija = new ArrayList<>();
    }

    // void setter за комбинацију

    public void setKombinacija() {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Unesite polja u formatu: " + "x ".repeat(velicina)));
        kombinacija.clear();

        for (int i = 0; i < velicina; i++) {
            var znak = sc.next();
            kombinacija.add(znak);
        }
        if (!Znakovi.dozvoljeniZnakovi.containsAll(kombinacija)) {
            System.out.println("Dozvoljena polja: " + Znakovi.dozvoljeniZnakovi);
            setKombinacija();
        }
    }

    public ArrayList<String> getKombinacija() {
        return kombinacija;
    }

    // void setRandom за комбинацију

    public void setRandom() {
        kombinacija.clear();
        for (int i = 0; i < velicina; i++) {
            var index = (int) (Math.random() * Znakovi.dozvoljeniZnakovi.size());
            kombinacija.add(Znakovi.dozvoljeniZnakovi.get(index));
        }
    }

    // boolean equals - Override

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KombinacijaZnakova that = (KombinacijaZnakova) o;
        return Objects.equals(kombinacija, that.kombinacija);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kombinacija);
    }

    // void porediKombinacije(KombinacijaZnakova kz)

    public void porediKombinacije(KombinacijaZnakova kz) {
        int brojTacnih = 0;
        int brNaPogresnomMestu = 0;

        List<String> tempTrazena = new ArrayList<>();
        List<String> tempTrenutna = new ArrayList<>();

        for (int i = 0; i < this.kombinacija.size(); i++) {
            if (this.kombinacija.get(i).equals(kz.kombinacija.get(i))) {
                brojTacnih++;
            }
        }

        for (int i = 0; i < this.kombinacija.size(); i++) {
            if (!this.kombinacija.get(i).equals(kz.kombinacija.get(i))) {
                tempTrazena.add(kz.kombinacija.get(i));
                tempTrenutna.add(this.kombinacija.get(i));
            }
        }

        for (int i = 0; i < tempTrazena.size(); i++) {
            for (int j = 0; j < tempTrazena.size(); j++) {
                if (tempTrazena.get(i).equals(tempTrenutna.get(j))) {
                    tempTrazena.remove(tempTrazena.get(i));
                    tempTrenutna.remove(tempTrenutna.get(j));
                    brNaPogresnomMestu++;
                    break;
                }
            }
        }

        for (int i = 0; i < tempTrazena.size(); i++) {
            for (int j = 0; j < tempTrazena.size(); j++) {
                if (tempTrazena.get(i).equals(tempTrenutna.get(j))) {
                    tempTrazena.remove(tempTrazena.get(i));
                    tempTrenutna.remove(tempTrenutna.get(j));
                    brNaPogresnomMestu++;
                    break;
                }
            }
        }

        for (int i = 0; i < tempTrazena.size(); i++) {
            for (int j = 0; j < tempTrazena.size(); j++) {
                if (tempTrazena.get(i).equals(tempTrenutna.get(j))) {
                    tempTrazena.remove(tempTrazena.get(i));
                    tempTrenutna.remove(tempTrenutna.get(j));
                    brNaPogresnomMestu++;
                    break;
                }
            }
        }

        for (int i = 0; i < tempTrazena.size(); i++) {
            for (int j = 0; j < tempTrazena.size(); j++) {
                if (tempTrazena.get(i).equals(tempTrenutna.get(j))) {
                    tempTrazena.remove(tempTrazena.get(i));
                    tempTrenutna.remove(tempTrenutna.get(j));
                    brNaPogresnomMestu++;
                    break;
                }
            }
        }
        System.out.println("🙂 ".repeat(brojTacnih) + "😡 ".repeat(brNaPogresnomMestu) + "\n");
    }
}
