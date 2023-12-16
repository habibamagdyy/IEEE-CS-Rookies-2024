
package knapsack;
import java.util.Scanner;
public class Knapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt(); 
        if (n < 1 || n > 20 || w < 1 || w > 100) {
            System.out.println("Please enter valid input values.");
            return;
        }

        int[] weights = new int[n];
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }
        int maxValue = knapsackMaxValue(n, w, weights, values);
        System.out.println(maxValue);
    }
    public static int knapsackMaxValue(int n, int w, int[] weights, int[] values) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (weights[n - 1] > w) {
            return knapsackMaxValue(n - 1, w, weights, values);
        }
        return Math.max(
                values[n - 1] + knapsackMaxValue(n - 1, w - weights[n - 1], weights, values),
                knapsackMaxValue(n - 1, w, weights, values)
        );
    }
}
