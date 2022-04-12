import java.sql.SQLOutput;
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
            System.out.println("Введите арифметическое действие из двух  цифр (арабских или римских) от 1 до 10 включительно: ");
            String ArifText = in.nextLine().trim().toUpperCase(Locale.ROOT);


            if (Pattern.matches("[IVX]+\\s*[+*-/]\\s*[IVX]+", ArifText)) {
                RomanNumber.romanToArab(ArifText);
            }
           else if (Pattern.matches("^([1-9]|[\\d]|10)\\s*?[+*/-]\\s*?([1-9]|[\\d]|10)$", ArifText)) {
                System.out.println("Результат вычисления выражения в арабских цифрах = " + ArabNumber.getArabNumber(ArifText));
            } else {
                throw new IllegalArgumentException("Введенное выражение не соответствует шаблону");

            }
        }
    }
}


