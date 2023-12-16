
package seq;
import java.util.Scanner;
public class Seq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        if (n < 1 || n > 100000) {
            System.out.println("Please enter a number between 1 & 10^5.");
            return;
        }
        int L =  calclength(n);
        
        System.out.println(L);
    }
    public static int calclength(int n) {
        if (n == 1) {
            return 1;
        } else {
            if (n % 2 == 0) {
                return 1 +  calclength(n / 2);
            } else {
                return 1 +  calclength(3 * n + 1);
            }
        }
    }
}
