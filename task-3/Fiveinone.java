
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
        System.out.println("The max number : " + getMaxNumber(A));
        System.out.println("The min number : " + getMinNumber(A));
        System.out.println("The number of prime numbers : " + countPrimes(A));
        System.out.println("The number of palindrome numbers : " + countPalindromes(A));
        System.out.println("The number that has the max number of divisors : " + getMaxDivisorNumber(A));

        scanner.close();
    }

    private static int getMaxNumber(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int getMinNumber(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int countPrimes(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    private static int countPalindromes(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPalindrome(num)) {
                count++;
            }
        }
        return count;
    }

    private static int getMaxDivisorNumber(int[] array) {
        int maxDivisors = 0;
        int result = array[0];

        for (int num : array) {
            int divisors = countDivisors(num);
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                result = num;
            } else if (divisors == maxDivisors && num > result) {
                result = num;
            }
        }

        return result;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    private static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
}
