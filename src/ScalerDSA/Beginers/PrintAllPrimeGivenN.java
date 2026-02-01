package ScalerDSA.Beginers;

import java.util.Scanner;

public class PrintAllPrimeGivenN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeTillN(n);
    }

    // Method to print all primes till N
    public static void printPrimeTillN(int n) {

        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check whether a number is prime
    public static boolean isPrime(int num) {
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
}