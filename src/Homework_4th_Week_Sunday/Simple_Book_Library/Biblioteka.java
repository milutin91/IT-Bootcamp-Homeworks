package Homework_4th_Week_Sunday.Simple_Book_Library;

import java.util.Arrays;

public class Biblioteka {
    Object[] knjige;

    public Biblioteka(Object[] knjige) {
        this.knjige = knjige;
    }

    public Object[] getKnjige() {
        return knjige;
    }

    public void setKnjige(Object[] knjige) {
        this.knjige = knjige;
    }

    @Override
    public String toString() {
        return "Knjige koje biblioteka poseduje:\n\n" + Arrays.toString(knjige);
    }
}
