
package swapping;
import java.util.Scanner;
public class Swapping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        performSwaps(A, X, Y);

        printMatrix(A);
    }
    static void performSwaps(int[][] A, int X, int Y) {
        int[] tempRow = A[X - 1];
        A[X - 1] = A[Y - 1];
        A[Y - 1] = tempRow;
        for (int i = 0; i < A.length; i++) {
            int temp = A[i][X - 1];
            A[i][X - 1] = A[i][Y - 1];
            A[i][Y - 1] = temp;
        }
    }
    static void printMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
