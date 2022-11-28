package chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void setUp() {
        factorial = new Factorial();
    }
    @Test
    public void getFactorial(){

        assertEquals(0, factorial.fact(5));
    }
}
