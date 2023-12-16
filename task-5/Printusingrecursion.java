
package printusingrecursion;
 import java.util.Scanner;
public class Printusingrecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            printDigits(n);
            System.out.println();
        }
    }

    public static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            printDigits(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}
