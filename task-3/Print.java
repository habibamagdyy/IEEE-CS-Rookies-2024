
package print;
import java.util.Scanner;
public class Print {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        printNumbers(N);
    }

    static void printNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
}
