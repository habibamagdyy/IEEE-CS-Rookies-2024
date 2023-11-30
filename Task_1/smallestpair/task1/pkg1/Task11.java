
package task1.pkg1;
 import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            int result = findSmallestSum(N, arr);
            System.out.println(result);
        }
    }

    private static int findSmallestSum(int N, int[] arr) {
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int currentSum = arr[i] + arr[j] + j - i;
                minSum = Math.min(minSum, currentSum);
            }
        }

        return minSum;
    
    }
}
    

