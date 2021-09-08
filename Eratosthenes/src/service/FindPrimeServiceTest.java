/*
 *  Class Name : service.FindPrimeServiceTest
 *
 *      Author : Roy Cantu
 *
 *        Date : 9/7/2021
 *
 * Description : Test class utilizing JUnit5, testing was focused on incorrect user input
 *
 */
package service;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;


public class FindPrimeServiceTest extends FindPrimeService {

    @Test
    public void testCases() {
        FindPrimeService primeService = new FindPrimeService();
        ArrayList<Integer> primeTest = new ArrayList<>();

        primeTest = primeService.findPrimes(primeTest, 20);

        Assertions.assertEquals(primeTest.contains(2), true);
        Assertions.assertEquals(primeTest.contains(3), true);
        Assertions.assertEquals(primeTest.contains(5), true);
        Assertions.assertEquals(primeTest.contains(7), true);
        Assertions.assertEquals(primeTest.contains(11), true);
        Assertions.assertEquals(primeTest.contains(13), true);
        Assertions.assertEquals(primeTest.contains(17), true);
        Assertions.assertEquals(primeTest.contains(19), true);

        Assertions.assertEquals(primeTest.contains(0), false);
        Assertions.assertEquals(primeTest.size(), 8);

    }
}
