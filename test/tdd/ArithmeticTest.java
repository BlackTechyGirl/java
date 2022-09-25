package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArithmeticTest {
    Arithmetic arithmetic;
    @BeforeEach
    void setThisUp(){

        arithmetic = new Arithmetic();
    }
    @Test
    void sum(){
       assertEquals(6, arithmetic.addThreeNumbers(2, 3, 1));
    }
    @Test
    void determineAverage(){
        assertEquals(2, arithmetic.averageOfThreeNumbers(2, 2, 2));
    }
    @Test
    void determineProduct(){
        assertEquals(8, arithmetic.productOfThreeNumbers(2, 2, 2));
    }
    @Test
    void determineTheSmallestOfThreeNumbers(){
        assertEquals(1,arithmetic.smallestNumber(1, 2, 3));
    }
    @Test
    void determineTheLargestestOfThreeNumbers(){
        assertEquals(3,arithmetic.largestestNumber(1, 2, 3));
    }
}
