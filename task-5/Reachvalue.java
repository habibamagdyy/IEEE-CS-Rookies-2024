
package reachvalue;
import java.util.Scanner;
public class Reachvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            if (n < 1 || n > Math.pow(10, 12)) {
                System.out.println("Please enter a number between 1 & 10^12.");
                return;
            }
            String R = canReachN(1, n) ? "YES" : "NO";
            System.out.println(R);
        }
    }
    public static boolean canReachN(long CV, long wantedValue) {
        if (CV == wantedValue) {
            return true;
        } else if (CV > wantedValue) {
            return false;
        } else {
            return canReachN(CV * 10, wantedValue) || canReachN(CV * 20, wantedValue);
        }
    }
}
