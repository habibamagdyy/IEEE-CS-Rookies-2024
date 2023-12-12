
package subsequencestring;
import java.util.Scanner;

public class Subsequencestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (isSubsequence(S, "hello")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }

    private static boolean isSubsequence(String str, String wanted) {
        int i = 0, j = 0;

        while (i < str.length() && j < wanted.length()) {
            if (str.charAt(i) == wanted.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == wanted.length();
   }

}
