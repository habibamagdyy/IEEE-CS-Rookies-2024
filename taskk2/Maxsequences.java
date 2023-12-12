
package maxsequences;
import java.util.Scanner;
public class Maxsequences {
 
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        int maxSize = calculateMaxSubsequenceSize(N, S);
        System.out.println(maxSize);

        scanner.close();
    }

    private static int calculateMaxSubsequenceSize(int N, String S) {
        int maxSize = 1; 

        for (int i = 1; i < N; i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                maxSize++;
            }
        }

        return maxSize;
    }
}

