
package xor;
import java.util.Scanner;
public class XOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long Q = scanner.nextLong();
        long result = calculateQthElement(A, B, Q);
        System.out.println(result);
    }

    private static long calculateQthElement(long A, long B, long Q) {
        long R =(Q%3);
        if (R == 1) {
            return A;
        } else if (R== 2) {
            return B;
        } else {
            return calculateQthElement(A, B, Q - 1) ^ calculateQthElement(A, B, Q - 2);
        }
    }
}
