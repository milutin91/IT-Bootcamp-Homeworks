package Additional_tasks;

import java.util.Scanner;

public class DodatniZadatak6 {

        /* 4. Написати функцију која проверава да ли је мејл валидан (претпоставити да имамо једно или 0 @ и једна .)
             - Мора имати знак `@`
             - Мора имати знак `.`
             - Пре знака @ мора постојати макар 1 карактер који је слово
                  - isLetter(char c)
             - После знака . мора постојати макар 1 карактер који је слово
             - Између @ и . мора постојати макар 1 карактер који је слово */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vas e-mail: ");
        String emailInput = sc.nextLine();
        System.out.println(emailValidation(emailInput));
    }

    public static boolean emailValidation(String email) {

        boolean condition = true;

        int positionAt = email.indexOf("@");
        int positionDot = email.indexOf(".");

        boolean condition1 = false;
        boolean condition2 = false;
        boolean condition3 = false;

        if (email.contains("@") && email.contains(".")) {
            for (int i = 0; i < email.length(); i++) {
                if (i < positionAt && Character.isLetter(email.charAt(i))) {
                    condition1 = true;
                }
                if ((i > positionAt && Character.isLetter(email.charAt(i))) && ((i < positionDot && Character.isLetter(email.charAt(i))))) {
                    condition2 = true;
                }
                if (i > positionDot && Character.isLetter(email.charAt(i))) {
                    condition3 = true;
                }
            }
        }
        return condition == condition1 && condition == condition2 && condition == condition3;
    }
}
