
package fibonacci;
  import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1 || n > 30) {
            System.out.println("Please enter a number between 1 & 30.");
            return;
        }
        int R = fibonacci(n);
        System.out.println(R);
    }
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
