import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Before
    public void setup() {
    }

    @Test
    public void printFizzIf3() {
        String result = fizzBuzz.process(3);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void printFizzIf6() {
        String result = fizzBuzz.process(6);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void printBuzzIf5() {
        String result = fizzBuzz.process(5);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void printBuzzIf10() {
        String result = fizzBuzz.process(10);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void printFizzBuzzIf15() {
        String result = fizzBuzz.process(15);
        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void print2If2() {
        String result = fizzBuzz.process(2);
        Assert.assertEquals("2", result);
    }

    @Test
    public void printFizzBuzzIf1845() {
        String result = fizzBuzz.process(1845);
        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void printFizzIf23() {
        String result = fizzBuzz.process(23);
        Assert.assertEquals("Fizz", result);
    }
}