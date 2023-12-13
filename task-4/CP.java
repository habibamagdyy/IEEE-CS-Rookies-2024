
package c.p;
 import java.util.Scanner;
public class CP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        long ncr = calculateNCR(A, B);
        long npr = calculateNPR(A, B);
        System.out.println(ncr + " " + npr);
    }

    private static long calculateNCR(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private static long calculateNPR(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    private static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
