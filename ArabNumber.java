import java.util.InputMismatchException;

public class ArabNumber {

    public static int getArabNumber(String wordFromMain) {

        int result = 0;
        char arabSign = 0;


        String[] number = wordFromMain.split("[+-/*]");

        int num1 = Integer.parseInt(number[0].trim());
        int num2 = Integer.parseInt(number[1].trim());

        if ((num1 >= 11 || num1 <= 0) || (num2 >= 11 || num2 <= 0)) {
            throw new IllegalArgumentException("Неверный формат данных");
        }

        char[] array = wordFromMain.toCharArray();

        for (int i = 0; i < array.length; i++) {
            char c = wordFromMain.charAt(i);

            if (c == '+' || c == '-' || c == '*' || c == '/') {
                arabSign = c;
            }
        }

        switch (arabSign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':

                result = num1 / num2;
                 break;

            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
}




