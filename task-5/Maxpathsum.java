
package maxpathsum;
import java.util.Scanner;
public class Maxpathsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int MS = maxsum(matrix, n, m, 0, 0);
        System.out.println(MS);
    }

    public static int maxsum(int[][] matrix, int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return matrix[i][j];
        }
        if (i >= n || j >= m) {
            return Integer.MIN_VALUE;
        }
        return matrix[i][j] + Math.max(maxsum(matrix, n, m, i + 1, j), maxsum(matrix, n, m, i, j + 1));
    }
}
