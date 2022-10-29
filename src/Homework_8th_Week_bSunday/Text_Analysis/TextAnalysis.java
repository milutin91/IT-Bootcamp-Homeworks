package Homework_8th_Week_bSunday.Text_Analysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class TextAnalysis {

    public static void main(String[] args) {

//        a) izbrojati koliko reda teksta ima u romanu (u našem fajlu)

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Domaci_8_Nedelja_bNedelja/na drini cuprija.txt"));
            System.out.println("Book \"Na Drini cuprija\" has " + countLines(reader) + " lines of text.");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        b) izbrojati koliko različitih reči ima u romanu (bez ponavljanja)

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Domaci_8_Nedelja_bNedelja/na drini cuprija.txt"));
            System.out.println("Number of unique words is " + UniqueWordsSet(reader).size() + ".");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        c) naći najdužu reč

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Domaci_8_Nedelja_bNedelja/na drini cuprija.txt"));
            System.out.print("Longest word(s) in book is(are):");
            longestWordsList(UniqueWordsSet(reader));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        d) naći najkraću reč

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Domaci_8_Nedelja_bNedelja/na drini cuprija.txt"));
            System.out.print("Shortest word(s) in book is(are):");
            shortestWordsList(UniqueWordsSet(reader));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        *e) naći 10 najkraćih reči

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Domaci_8_Nedelja_bNedelja/na drini cuprija.txt"));
            List<String> sortedUnique;
            ArrayList<String> uniqueWords = new ArrayList<>(UniqueWordsSet(reader));
            List<String> tenShortest = new ArrayList<>();

            System.out.print("10 shortest words in book are:");
            sortedUnique = uniqueWords.stream()
                    .sorted(Comparator.comparing(String::length))
                    .collect(Collectors.toList());

            int count = 0;
            for (var el : sortedUnique){
                tenShortest.add(el);
                count++;
                if(count == 10) break;
            }

            System.out.println(tenShortest.toString().replace('[',' ').replace(']','.'));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        *f) naći 10 najduzih reči

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Domaci_8_Nedelja_bNedelja/na drini cuprija.txt"));
            List<String> reverseSortedUnique;
            ArrayList<String> uniqueWords = new ArrayList<>(UniqueWordsSet(reader));
            List<String> tenShortest = new ArrayList<>();

            System.out.print("10 longest words in book are:");
            reverseSortedUnique = uniqueWords.stream()
                    .sorted(Comparator.comparing(String::length).reversed())
                    .collect(Collectors.toList());

            int count = 0;
            for (var el : reverseSortedUnique){
                tenShortest.add(el);
                count++;
                if(count == 10) break;
            }

            System.out.println(tenShortest.toString().replace('[',' ').replace(']','.'));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        *g) naći 10 najkorišćenijih reči i broj njihovog ponavljanja

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Domaci_8_Nedelja_bNedelja/na drini cuprija.txt"));
            HashMap<String, Integer> frequencyOfWords = new HashMap<>();
            ArrayList<String> topTenMostUsedWordsKey = new ArrayList<>();
            ArrayList<Integer> topTenMostUsedWordsValue = new ArrayList<>();
            HashMap<String, Integer> topTenUsedWords = new HashMap<>();
            HashMap<String, Integer> sortedTopTen;

            HashMap<String, Integer> reverseSortedMap;

            System.out.print("10 most used words:");
            for (var el : allWords(reader)){
                if(!frequencyOfWords.containsKey(el)){
                    frequencyOfWords.put(el, 1);
                }else{
                    frequencyOfWords.put(el, frequencyOfWords.get(el) + 1);
                }
            }

            reverseSortedMap = frequencyOfWords
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(
                            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                    LinkedHashMap::new));

            int count = 0;
            for (var el : reverseSortedMap.keySet()){
                topTenMostUsedWordsKey.add(el);
                count++;
                if(count == 10) break;
            }
            int count2 = 0;
            for (var el : reverseSortedMap.values()){
                topTenMostUsedWordsValue.add(el);
                count2++;
                if(count2 == 10) break;
            }
            for (int i = 0; i < 10; i++) {
                topTenUsedWords.put(topTenMostUsedWordsKey.get(i), topTenMostUsedWordsValue.get(i));
            }
            sortedTopTen = topTenUsedWords
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(
                            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                    LinkedHashMap::new));
            System.out.println(sortedTopTen.toString().replace('{',' ').replace('}','.'));

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        *h) naći koliko rečenica (završavaju se sa ".") ima u romanu

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Domaci_8_Nedelja_bNedelja/na drini cuprija.txt"));
            System.out.print("Sentences ended with '.': ");
            int count = 0;
            for (var el : allWordsWithDot(reader)){
                if(el.charAt(el.length() - 1) == '.'){
                    count++;
                }
            }
            System.out.println(count);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String regex(){
        return "\\s|\\.|,|\\?|!|:|;|-|_|—|\\(|\\)|»|«|\"";
    }

    public static String regexNoDot(){
        return "\\s|,|\\?|!|:|;|-|_|—|\\(|\\)|»|«|\"";
    }

    public static int countLines(BufferedReader reader) throws IOException {
        String s;
        int count = 0;
        while ((s = reader.readLine()) != null) {
            if (!s.equals("")) {
                count++;
            }
        }
        return count;
    }

    public static HashSet<String> UniqueWordsSet(BufferedReader reader) throws IOException {
        HashSet<String> uniqueWordsSet = new HashSet<>();
        String s;
        while ((s = reader.readLine()) != null) {
            String[] str = s.split(regex());
            if(!s.equals("")){
                for (String value : str) {
                    if (!Objects.equals(value, "")) {
                        uniqueWordsSet.add(value.toLowerCase());
                    }
                }
            }
        }
        return uniqueWordsSet;
    }

    public static String longestWord(HashSet<String> set) {
        String max = "";
        for (var el : set){
            if(el.length() > max.length()){
                max = el;
            }
        }
        return max;
    }

    public static void longestWordsList(HashSet<String> set){
        ArrayList<String> loWordsList = new ArrayList<>();
        String max = "";
        for (var el : set){
            if(el.length() > max.length()){
                max = el;
            }
        }
        for (var el : set){
            if(el.length() == max.length()){
                loWordsList.add(el);
            }
        }
        System.out.println(loWordsList.toString().replace('[',' ').replace(']','.'));
    }

    public static void shortestWordsList(HashSet<String> set){
        ArrayList<String> shWordsList = new ArrayList<>();
        String min = longestWord(set);
        for (var el : set){
            if(el.length() < min.length()){
                min = el;
            }
        }
        for (var el : set){
            if(el.length() == min.length()){
                shWordsList.add(el);
            }
        }
        System.out.println(shWordsList.toString().replace('[',' ').replace(']','.'));
    }
    public static ArrayList<String> allWordsWithDot(BufferedReader reader) throws IOException {
        ArrayList<String> allWordsListDot = new ArrayList<>();
        String s;
        while ((s = reader.readLine()) != null) {
            String[] str = s.split(regexNoDot());
            if(!s.equals("")){
                for (String value : str) {
                    if (!Objects.equals(value, "")) {
                        allWordsListDot.add(value.toLowerCase());
                    }
                }
            }
        }
        return allWordsListDot;
    }

    public static ArrayList<String> allWords(BufferedReader reader) throws IOException {
        ArrayList<String> allWordsList = new ArrayList<>();
        String s;
        while ((s = reader.readLine()) != null) {
            String[] str = s.split(regex());
            if(!s.equals("")){
                for (String value : str) {
                    if (!Objects.equals(value, "")) {
                        allWordsList.add(value.toLowerCase());
                    }
                }
            }
        }
        return allWordsList;
    }
}


