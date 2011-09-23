package fr.kata.fizzbuzz;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * User: florian
 * Date: 23/09/11
 * Time: 11:26
 */
public class FizzBuzzTest {
    @Test
    public void giveOneHundredFirstInteger() {
        final FizzBuzzer fizzBuzzer = new FizzBuzzer();

        List<String> fizzbuzz = fizzBuzzer.generateFizzBuzz();

        assertThat(fizzbuzz, notNullValue());
        assertThat(fizzbuzz.size(), is(100));
    }

    @Test
    public void firstIsOne() {
        List<String> fizzBuzz = giveFizzBuzz();

        assertThat(fizzBuzz.get(1), is("1"));
    }

    @Test
    public void secondIsTwo() {
        List<String> fizzBuzz = giveFizzBuzz();

        assertThat(fizzBuzz.get(2), is("2"));
    }

    @Test
    public void thirdIsFizz() {
        List<String> fizzbuzz = giveFizzBuzz();

        assertThat(fizzbuzz.get(3), is("fizz"));
    }

    @Test
    public void fiveIsBuzz() {
        List<String> fizzbuzz = giveFizzBuzz();

        assertThat(fizzbuzz.get(5), is("buzz"));
    }

    @Test
    public void multipleOfTreeIsFizz() {
        List<String> fizzbuzz = giveFizzBuzz();

        assertThat(fizzbuzz.get(6), is("fizz"));
    }

    @Test
    public void multipleOfFiveIsBuzz() {
        List<String> fizzbuzz = giveFizzBuzz();

        assertThat(fizzbuzz.get(10), is("buzz"));
    }

    @Test
    public void multipleOfThreeAndFiveIsFizzBuzz() {
        List<String> fizzbuzz = giveFizzBuzz();

        assertThat(fizzbuzz.get(15), is("fizzbuzz"));
    }

    private List<String> giveFizzBuzz() {
        final FizzBuzzer fizzBuzzer = new FizzBuzzer();

        return fizzBuzzer.generateFizzBuzz();
    }
}