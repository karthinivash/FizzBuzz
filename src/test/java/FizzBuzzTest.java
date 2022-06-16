import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void ReturnFizzIfTheNumberDivisibleBy3() {

        FizzBuzz fizzbuzz = new FizzBuzz();

        String result = fizzbuzz.FizzBuzzPrinter(9);

        assertEquals("Fizz",result);
    }

    @Test
    void ReturnBuzzIfTheNumberDivisibleBy5() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.FizzBuzzPrinter(20);

        assertEquals("Buzz",result);

    }

    @Test
    void ReturnFizzBuzzIfTheNumberDivisibleByBoth3And5() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.FizzBuzzPrinter(30);

        assertEquals("FizzBuzz",result);
    }

    @Test
    void ReturnTheNumberInStringFormatIfTheNumberIsNeitherDivisibleBy3Nor5() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.FizzBuzzPrinter(13);

        assertEquals("13",result);
    }

}
