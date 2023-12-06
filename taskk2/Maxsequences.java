
package maxsequences;
import java.util.Scanner;
public class Maxsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        int maxSubsequenceSize = calculateMaxSubsequenceSize(S);
        System.out.println(maxSubsequenceSize);
        scanner.close();
    }

    private static int calculateMaxSubsequenceSize(String str) {
        int maxSubsequenceSize = 1;
        int currentSize = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                currentSize++;
            } else {
                maxSubsequenceSize = Math.max(maxSubsequenceSize, currentSize);
                currentSize = 1;
            }
        }
        maxSubsequenceSize = Math.max(maxSubsequenceSize, currentSize);

        return maxSubsequenceSize;
    }
    
}
