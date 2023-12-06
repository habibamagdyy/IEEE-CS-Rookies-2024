
package goodorbad;
import java.util.Scanner;

public class Goodorbad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            String S = scanner.next();
            if (S.contains("010") || S.contains("101")) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
        scanner.close();
    }
    
}
