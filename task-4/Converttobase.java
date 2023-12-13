
package converttobase;
import java.util.Scanner;

public class converttobase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String N = scanner.next();
        int X = scanner.nextInt();

        if (T == 1) {
            long R = baseToDecimal(N, X);
            System.out.println(R);
        } else if (T == 2) {
            String  R= decimalToBase(Long.parseLong(N), X);
            System.out.println(R);
        }
        scanner.close();
    }

    private static long baseToDecimal(String number, int base) {
        long R = 0;
        int power = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            char chardigit = number.charAt(i);
            int digitValue = getDigitValue(chardigit);
           R += digitValue * Math.pow(base, power);
            power++;
        }

        return R;
    }

    private static String decimalToBase(long number, int base) {
        StringBuilder R= new StringBuilder();

        while (number > 0) {
            long remainder = number % base;
            char chardigit = getCharValue((int) remainder);
            R.insert(0, chardigit);
            number /= base;
        }

        return R.toString();
    }

    private static int getDigitValue(char chardigit) {
        if (Character.isDigit(chardigit)) {
            return chardigit - '0';
        } else {
            return chardigit - 'A' + 10;
        }
    }

    private static char getCharValue(int digitValue) {
        if (digitValue < 10) {
            return (char) (digitValue + '0');
        } else {
            return (char) (digitValue - 10 + 'A');
        }
    }
}
