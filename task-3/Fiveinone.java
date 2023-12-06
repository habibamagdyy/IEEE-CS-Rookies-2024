
package fiveinone;
import java.util.Scanner;
public class Fiveinone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("The maximum number : " + getMax(A));
        System.out.println("The minimum number : " + getMin(A));
        System.out.println("The number of prime numbers : " + countPrimes(A));
        System.out.println("The number of palindrome numbers : " + countPalindromes(A));
        System.out.println("The number that has the maximum number of divisors : " + maxDivisorsNumber(A));
    }
    static int getMax(int[] A) {
        int max = A[0];
        for (int num : A) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    static int getMin(int[] A) {
        int min = A[0];
        for (int num : A) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    static int countPrimes(int[] A) {
        int count = 0;
        for (int num : A) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
    static int countPalindromes(int[] A) {
        int count = 0;
        for (int num : A) {
            if (isPalindrome(num)) {
                count++;
            }
        }
        return count;
    }
    static int maxDivisorsNumber(int[] A) {
        int maxDivisors = 0;
        int maxDivisorsNumber = A[0];

        for (int num : A) {
            int divisorsCount = countDivisors(num);
            if (divisorsCount > maxDivisors) {
                maxDivisors = divisorsCount;
                maxDivisorsNumber = num;
            }
        }

        return maxDivisorsNumber;
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
