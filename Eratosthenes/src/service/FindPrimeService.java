package service;

import java.util.Arrays;

public class FindPrimeService {

    public void findPrimes(int maxNum) {
        // Create boolean array and initialize all entries as True
        boolean[] isPrime = new boolean[maxNum];
        Arrays.fill(isPrime, true);

        // Using Sieve of Eratosthenes mark all non-prime numbers
        for (int i = 2; i < Math.sqrt(maxNum); i++) {
            if (isPrime[i]) {
                for (int j = (i*i); j < maxNum; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print all prime numbers to console
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
