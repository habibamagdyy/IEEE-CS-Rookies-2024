
package arrayavg;
import java.util.Scanner;
public class Arrayavg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double average = calculateAverage(arr, n);
        System.out.printf("%.6f", average);
    }
 
    public static double calculateAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return (calculateAverage(arr, n - 1) * (n - 1) + arr[n - 1]) / n;
    }
}
