/*
 *  Class Name : FinePrime
 *
 *      Author : Roy Cantu
 *
 *        Date : 9/6/2021
 *
 * Description : Main class that creates an FindPrimeService object
 *               which calls findPrimes method utilizing Sieve of Eratosthenes
 *               to find all primes between 1 and number provided by user
 */
package main;

import java.util.Scanner;
import service.FindPrimeService;

public class FindPrime {

    public static void main(String[] args) {

        // create scanner and service objects for use
        Scanner input = new Scanner(System.in);
        FindPrimeService primeService = new FindPrimeService();

        // Repeat functionality until user enters 0
        while(true) {

            // Initial user prompt
            System.out.println("\nEnter an Integer (0 to quit):");

            // try/catch to throw error if non int is entered
            try {
                // assign input to variable to pass to service
                int maxNum = input.nextInt();

                // check if input equal to 0
                if (maxNum == 0) {
                    break;
                } else {
                    primeService.findPrimes(maxNum);
                }

            } catch (Throwable e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
