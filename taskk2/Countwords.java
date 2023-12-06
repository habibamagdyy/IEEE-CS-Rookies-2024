
package countwords;
import java.util.Scanner;
public class Countwords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int wordCount = countWords(S);
        System.out.println(wordCount);
        scanner.close();
    }

    private static int countWords(String str) {
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (!isWord) {
                    wordCount++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }

        return wordCount;
    }
}
