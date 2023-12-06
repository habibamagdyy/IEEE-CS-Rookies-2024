
package prime;
import java.util.Scanner;
public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            if (isPrime(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }

        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }

        return true;
    }
    
}
