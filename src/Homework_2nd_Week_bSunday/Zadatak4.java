package Homework_2nd_Week_bSunday;
import java.util.Arrays;

        /*4. Написати коментаре у Јави за Selection sort алгоритам користећи Јава код
            приказан у задатку.

            ● Ради лакшег разумевања може се користити видео материјал на
            следећем линку: https://www.youtube.com/watch?v=xWBP4lzkoyM

     */

public class Zadatak4 {

    static  class Main
    {
        public static void swap(int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Додати коментар шта ова функција ради - Funkcija sortira brojeve u nizu od najmanjeg do najveceg.
        public static void selectionSort(int[] arr)
        {
// Додати коментар за петљу - Iterarcije se izvrsavaju onoliko puta koliko je dugacak niz - 1 (od 0 do 6 = 7 pozicija, zato je arr.length - 1)
            for (int i = 0; i < arr.length - 1; i++)
            {
// Додати коментар - Za minimalnu vrednost uzimamo pocetnu poziciju iteracije spoljne for petlje, svaki krug unutrasnje petlje pocinje od i + 1
                int min = i;
                for (int j = i + 1; j < arr.length; j++)
                {
// Додати коментар - ako je u unutrasnjoj for petlji, broj na j poziciji u nizu manji od broja na min poziciji u nizu, min se dodeljuje j
                    if (arr[j] < arr[min]) {
                        min = j; // Додати коментар - ako je uslov ispunjen j pozicija postaje min pozicija
                    }
                }
// Додати коментар шта ова функција ради и шта представљају ови параметри - Menja pozicije najmanjeg broja sa pocetnom pozicijom trenutne iteracije.
// Prvi parametar je niz, drugi parametra je pozicija sa najmanjim broj (trenutne iteracije) iz selectionSort funkcije, a treci parametar je pocetna
// pozicija trenutne iteracije iz selectionSort funkcije.

                swap(arr, min, i);
            }
        }
        public static void main(String[] args)
        {
            int[] arr = { 3, 5, 8, 4, 1, 9, -2 };
            selectionSort(arr);
// Додати коментар шта се исписује - Ispisuju se elementi niza arr u vidu stringa.
            System.out.println(Arrays.toString(arr));
        }
    }
}

