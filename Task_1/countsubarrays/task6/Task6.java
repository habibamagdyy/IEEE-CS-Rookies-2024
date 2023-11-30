package task6;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    boolean isNonDecreasing = true;
                    for (int k = i + 1; k <= j; k++) {
                        if (arr[k - 1] > arr[k]) {
                            isNonDecreasing = false;
                            break;
                        }
                    }
                    if (isNonDecreasing) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}

