package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach //or @setup and tear down
    public void setThisUp(){

        calculator = new Calculator();
    }


    @Test
    void testThatObjectExist(){

        assertNotNull(calculator);
    }
    @Test
    void sum(){

        assertEquals(9, calculator.addTwoNumbers(3,6));
    }
    @Test
    void subtract(){
        calculator.subtractNumber(4, 2);
        assertEquals(2, calculator.subtractNumber(4, 2));
    }
//    @Test
//    void testUserInput(){
//        calculator.collectUserInput(5, 15, 4);
//    }
}
