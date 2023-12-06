
package wonderfulnumber;
import java.util.Scanner;
public class WonderfulNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (isWonderful(N)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    static boolean isWonderful(int N) {
        if (N % 2 != 0) {
            String binaryRepresentation = Integer.toBinaryString(N);
            return isPalindrome(binaryRepresentation);
        }
        return false;
    }
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
