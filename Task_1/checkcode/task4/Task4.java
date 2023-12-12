
package task4;
import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String S = scanner.next();
    
        boolean isValid = isValidCode(A, B, S);
        System.out.println(isValid ? "Yes" : "No");

        scanner.close();
    }
 
    private static boolean isValidCode(int A, int B, String S) {

        if (S.length() != A + B + 1) {
            return false;
        }
        if (S.charAt(A) != '-') {
            return false;
        }
        for (int i = 0; i < A + B + 1; i++) {
            if (i != A && !Character.isDigit(S.charAt(i))) {
                return false;
            }
        }
 
        return true;
    }
}
    

