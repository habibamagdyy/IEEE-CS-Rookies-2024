
package task5;
import java.util.Scanner;
public class Task5 {
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] A = new int[x];
 
        for (int i = 0; i < x; i++) {
            A[i] = scanner.nextInt();
        }
        int maxOperations = calculateMaxOperations(x, A);
        System.out.println(maxOperations);
        scanner.close();
    }
 
    private static int calculateMaxOperations(int x, int[] A) {
        int maxOperations = 0;
        while (areAllEven(A)) {
            for (int i = 0; i < x; i++) {
                A[i] /= 2;
            }
            maxOperations++;
        }
 
        return maxOperations;
    }
 
    private static boolean areAllEven(int[] array) {
        for (int num : array) {
            if (num % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
    
       

