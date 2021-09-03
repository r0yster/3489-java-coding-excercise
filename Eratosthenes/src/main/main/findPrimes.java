import java.io.*;
import java.util.Scanner;



public class findPrimes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter an Integer (0 to quit):");
            try {
                int maxNum = input.nextInt();
                System.out.println("You entered: " + maxNum);
                if (maxNum == 0) {
                    break;
                }
            } catch (Throwable e) {
                e.printStackTrace();
                break;
            }
        }
    }
}