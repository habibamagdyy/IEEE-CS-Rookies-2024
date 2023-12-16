
package print1ton;
import java.util.Scanner;
public class Print1toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1 || n > 1000) {
            System.out.println("Please enter a number between 1 & 1000.");
            return;
        }
        printNumbers(1, n);
    }
    public static void printNumbers(int x, int n) {
        if (x <= n) {
            System.out.println(x);
            printNumbers(x + 1, n);
        }
    }
}
