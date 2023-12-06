
package encryptanddecrypt;
import java.util.Scanner;
public class Encryptanddecrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        scanner.nextLine(); 
        String S = scanner.nextLine();
        if (Q == 1) {
            String encryptedString = encrypt(S);
            System.out.println(encryptedString);
        } else if (Q == 2) {
            String decryptedString = decrypt(S);
            System.out.println(decryptedString);
        }
        scanner.close();
    }

    private static String encrypt(String original) {
        String originalChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String keyChars = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";

        StringBuilder result = new StringBuilder();

        for (char ch : original.toCharArray()) {
            int index = originalChars.indexOf(ch);
            result.append(index != -1 ? keyChars.charAt(index) : ch);
        }

        return result.toString();
    }

    private static String decrypt(String encrypted) {
        String originalChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String keyChars = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";

        StringBuilder result = new StringBuilder();

        for (char ch : encrypted.toCharArray()) {
            int index = keyChars.indexOf(ch);
            result.append(index != -1 ? originalChars.charAt(index) : ch);
        }

        return result.toString();
    }
    
}
