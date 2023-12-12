
package print;
import java.util.Scanner;
public class Print {
    
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        printNumbers(x);
        scanner.close();
    }

    private static void printNumbers(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(i);
            if (i < x) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
