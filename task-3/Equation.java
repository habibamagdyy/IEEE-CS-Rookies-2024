
package equation;
import java.util.Scanner;

public class Equation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int result = calculateEquationResult(X, N);
        System.out.println(result);
    }
    static int calculateEquationResult(int X, int N) {
        int result = 0;

        for (int i = 0; i <= N; i += 2) {
            result += Math.pow(X, i);
        }

        return result;
    }
}
