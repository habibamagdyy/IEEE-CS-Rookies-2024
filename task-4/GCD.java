
package gcd;
import java.util.Scanner;
public class GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long gcd = calculateGCD(A, B);
        long lcm = calculateLCM(A, B, gcd);
        System.out.println(gcd + " " + lcm);
    }

    private static long calculateGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static long calculateLCM(long a, long b, long gcd) {
        return (a * b) / gcd;
    }
}
