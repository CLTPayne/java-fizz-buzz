import static org.junit.Assert.*;
import org.junit.Test;

public class ExampleTest {


    @Test
    public void checksIfItsDivisibleByFifteen() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String answer = fizzbuzz.fb(15);
        assertEquals(answer, "FIZZBUZZ");
    }


    @Test
    public void addsTwoNumbersTogether() {
        Example example = new Example();
        int answer = example.add(2, 3);
        assertEquals(answer, 5);
    }
}
