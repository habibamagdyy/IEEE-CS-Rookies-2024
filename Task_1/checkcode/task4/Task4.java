
package task4;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(); 
        int B = scanner.nextInt();

        int length = A + B + 1;

        String code = scanner.next(); 
        if (code.charAt(A) == '-' && code.length() == length) {
            boolean isValid = true;
            for (int i = 0; i < length; i++) {
                if (i != A && !Character.isDigit(code.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
    

