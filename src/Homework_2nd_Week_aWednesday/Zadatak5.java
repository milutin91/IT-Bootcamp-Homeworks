package Homework_2nd_Week_aWednesday;

public class Zadatak5 {
      public static void main(String[] args) {

          String str = "This website is for losers LOL!";
          System.out.println(str);
          System.out.println(removeVowels(str));
      }

      //https://www.codewars.com/kata/52fba66badcd10859f00097e/solutions/java

      public static String removeVowels(String str) {

          // pomocu replaceAll() slova a, e, i, o, u, A, E, I, O, U menjamo praznim stringom "" i na taj nacin izbacujemo sve samoglasnike.

          return str.replaceAll("[aeiouAEIOU]", "");

      }
}
