import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Before
    public void initObjects() {
        fizzbuzz = new FizzBuzz();
    }

        @Test
        public void checksIfItsDivisibleByFifteen () {
            String answer = fizzbuzz.fb(15);
            assertEquals("FIZZBUZZ", answer);
        }

        @Test
        public void checksIfItsDivisibleByFive () {
            String answer = fizzbuzz.fb(5);
            assertEquals("BUZZ", answer);
        }

        @Test
        public void checksIfItsDivisibleByThree () {
            String answer = fizzbuzz.fb(3);
            assertEquals("FIZZ", answer);
        }

        @Test
        public void checksIfANonFizzBuzzNumberIsReturned () {
            String answer = fizzbuzz.fb(2);
            assertEquals("2", answer);
        }
}

