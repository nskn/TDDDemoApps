import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class NumberAnalyserTest {
    NumberAnalyser numberAnalyser;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        numberAnalyser = new  NumberAnalyser();
    }
    @Test
    public void given_fizzbizz_returns_result() {
        assertEquals("1", numberAnalyser.fizzBuzz(1));
    }
    @Test
    public void for_given_number_fizzbizz_returns_fizz() {
        assertEquals("Fizz", numberAnalyser.fizzBuzz(9));
    }
    @Test
    public void for_given_number_fizzbizz_returns_bizz() {
        assertEquals("Bizz", numberAnalyser.fizzBuzz(10)) ;
    }
    @Test
    public void for_given_number_fizzbizz_returns_fizzbizz() {
        assertEquals("FizzBizz", numberAnalyser.fizzBuzz(15)) ;
    }

    @Test
    public void print_fizz_for_given_number(){
        numberAnalyser.printVal(9);
        assertEquals("Fizz", outContent.toString());
    }
    
    @Test
    public void print_bizz_for_given_number(){
        numberAnalyser.printVal(20);
        assertEquals("Bizz", outContent.toString());
    }
    @Test
    public void print_FizzBizz_for_given_number(){
        numberAnalyser.printVal(30);
        assertEquals("FizzBizz", outContent.toString());
    }
    @After
    public void tearDown() {
        System.setOut(originalOut);
        numberAnalyser = null;
    }
}
