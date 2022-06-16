import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void ReturnFizzIfTheNumberDivisibleBy3() {

        FizzBuzz fizzbuzz = new FizzBuzz();

        String result = fizzbuzz.print(9);

        assertEquals("Fizz",result);
    }


}