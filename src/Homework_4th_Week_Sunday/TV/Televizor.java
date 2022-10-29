package Homework_4th_Week_Sunday.TV;

class Televizor {
    int jacinaTona = 0;
    int trenutniProgram = 1;
    boolean ukljucen = false;

    void ukljuci() {
        ukljucen = true;
    }

    void iskljuci() {
        ukljucen = false;
    }

    void pojacajTon() {
        jacinaTona = jacinaTona + 1;
    }

    void smanjiTon() {
        jacinaTona = jacinaTona - 1;
    }

    void iskljuciTon() {
        jacinaTona = 0;
    }

    void promeniProgramNavise() {
        trenutniProgram++;
    }

    void promeniProgramNanize() {
        trenutniProgram--;
    }

    int vratiTrenutniProgram() {
        return trenutniProgram;
    }

    int vratiJacinuTona() {
        return jacinaTona;
    }

    boolean daLiJeUkljucen() {
        return ukljucen;
    }

    void ispisiParametre() {
        if (ukljucen) {
            System.out.println("TV Status: " + ukljucen + "\n\t" + "Jacina tona: " + jacinaTona + "\n\t" + "Trenutni program: " + trenutniProgram);
        } else {
            System.out.println("TV Status: " + ukljucen);
        }
    }
}
