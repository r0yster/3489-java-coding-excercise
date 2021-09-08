package service;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPrimeService {

    public ArrayList<Integer> findPrimes(ArrayList<Integer> primes, int maxNum) {
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

        // Add all prime numbers to primes ArrayList
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public void printPrimes(ArrayList primes) {
        for (int i = 0; i < primes.size(); i++) {
            System.out.print(primes.get(i) + " ");
        }
    }
}
