public class RomanNumber {

    public static void romanToArab(String romanWord) {

        String[] word = romanWord.trim().split("[+/*-]");
        char romanSign = 0;
        for (int i = 0; i < romanWord.length(); i++) {
            char c = romanWord.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                romanSign = c;
            }
        }

        int result = 0;
        int a = (RomanNumeral.valueOf(word[0].trim()).getValue());
        int b = (RomanNumeral.valueOf(word[1].trim()).getValue());

        switch (romanSign) {
            case '+':
                result = a + b;
                break;
            case '-':
                if (a > b) {
                    result = a - b;
                } else {
                    throw new IllegalArgumentException("Выражение неверно, т.к. в римской системе нет отрицательных чисел");
                }

                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("РИМневерный знак!!!");
        }
        getRomanNumber(result);
    }

    public static void getRomanNumber(int result) {
        StringBuilder romanNumber = new StringBuilder(" ");

        while (result >= 100) {
            romanNumber.append("C");
            result -= 100;
        }
        while (result >= 90) {
            romanNumber.append("XC");
            result -= 90;
        }
        while (result >= 50) {
            romanNumber.append("L");
            result -= 50;
        }
        while (result >= 40) {
            romanNumber.append("XL");
            result -= 40;
        }
        while (result >= 10) {
            romanNumber.append("X");
            result -= 10;
        }
        while (result >= 9) {
            romanNumber.append("IX");
            result -= 9;
        }
        while (result >= 5) {
            romanNumber.append("V");
            result -= 5;
        }
        while (result >= 4) {
            romanNumber.append("IV");
            result -= 4;
        }
        while (result >= 1) {
            romanNumber.append("I");
            result -= 1;
        }
        System.out.println("Результат вычисления выражения в римских цифрах = " + romanNumber);
    }
}








