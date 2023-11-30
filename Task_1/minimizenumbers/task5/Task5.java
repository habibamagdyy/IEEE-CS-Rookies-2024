
package task5;
import java.util.Scanner;
public class Task5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

       
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int operations = 0;
        boolean allEven = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                allEven = false;
                break;
            }
        }

        while (allEven) {
            operations++;
            for (int i = 0; i < n; i++) {
                arr[i] /= 2;
                if (arr[i] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }
        }

        System.out.println(operations - 1); 

        scanner.close();
    }
}

