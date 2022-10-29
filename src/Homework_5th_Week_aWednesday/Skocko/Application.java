package Homework_5th_Week_aWednesday.Skocko;

public class Application {
    public static void main(String[] args) {

        var trazKom = new KombinacijaZnakova(4);
        trazKom.setRandom();
        var trenKom = new KombinacijaZnakova(4);
        var brPokusaja = 0;
        var maxBrPokusaja = 6;

        var igra = new Skocko(maxBrPokusaja, brPokusaja, trazKom, trenKom);

        System.out.println(trazKom.getKombinacija());

        System.out.println("~~~Dobrodosli u MasterMind~~~\n\nImate " + maxBrPokusaja +
                " pokusaja da nadjete kombinaciju!\nDozvoljeni karakteri su: " + Znakovi.dozvoljeniZnakovi + "\n");

        while (!igra.jeGotova()) {
            igra.pokusaj();
        }
    }
}
