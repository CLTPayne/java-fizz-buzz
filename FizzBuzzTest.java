import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class FizzBuzzTest {


        @Test
        public void checksIfItsDivisibleByFifteen () {
            FizzBuzz fizzbuzz = new FizzBuzz();
            String answer = fizzbuzz.fb(15);
            assertEquals("FIZZBUZZ", answer);
        }

        @Test
        public void checksIfItsDivisibleByFive () {
            FizzBuzz fizzbuzz = new FizzBuzz();
            String answer = fizzbuzz.fb(5);
            assertEquals("BUZZ", answer);
        }

        @Test
        public void checksIfItsDivisibleByThree () {
            FizzBuzz fizzbuzz = new FizzBuzz();
            String answer = fizzbuzz.fb(3);
            assertEquals("FIZZ", answer);
        }

        @Test
        public void checksIfANonFizzBuzzNumberIsReturned () {
            FizzBuzz fizzbuzz = new FizzBuzz();
            String answer = fizzbuzz.fb(2);
            assertEquals("2", answer);
        }
}

//
//    @Before
//    public void initObjects() {
//        FizzBuzz fizzbuzz = new FizzBuzz();
//        System.out.println(fizzbuzz);
//    }