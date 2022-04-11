import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        while (true) {
            Scanner in;
            try {
                in = new Scanner(System.in);
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                continue;
            }
            System.out.println("Введите арифметическое действие из двух  цифр (арабских или римских): ");
            String ArifText = in.nextLine().trim().toUpperCase(Locale.ROOT);


            if (Pattern.matches("[IVX]+\\s*[+*-/]\\s*[IVX]+", ArifText)) {
                RomanNumber.romanToArab(ArifText);
            } else {
                System.out.println("Результат вычисления выражения в арабских цифрах = " + ArabNumber.getArabNumber(ArifText));
            }
        }
    }
}


