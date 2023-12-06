
package createanewstring;
import java.util.Scanner;

public class Createanewstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        System.out.println(S.length() + " " + T.length());
        System.out.println(S + " " + T);

        scanner.close();
    }
}

    

