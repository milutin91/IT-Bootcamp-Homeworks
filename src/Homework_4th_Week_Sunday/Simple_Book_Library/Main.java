package Homework_4th_Week_Sunday.Simple_Book_Library;

public class Main {
    public static void main(String[] args) {

        Knjiga k1 = new Knjiga("Alhemicar", 1988);
        Knjiga k2 = new Knjiga("Mali Princ", 1943);
        Knjiga k3 = new Knjiga("Rat i mir", 1869);

        k1.izdajKnjigu();

        Object[] knjige = {k1, k2, k3};

        Biblioteka b1 = new Biblioteka(knjige);
        System.out.println(b1);
    }
}
