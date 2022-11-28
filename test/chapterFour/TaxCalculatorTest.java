package chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    private TaxCalculator taxCalculator;

    private Citizen Mathias;
    private Citizen Adewunmi;
    private Citizen Adeola;
    @BeforeEach
    public void setUp(){
        Mathias = new Citizen();
        Mathias.setFirstname("Mathias");
        Mathias.setSurname("Momodu");
        BigDecimal salary = new BigDecimal(17000);
        Mathias.setEarnings(salary);

        Adewunmi = new Citizen("Adewunmi", "Ade");
        Adewunmi.setEarnings(BigDecimal.valueOf(25000));

        Adeola = new Citizen("Adeola", "Adekunle",BigDecimal.valueOf(45000));

    }


    @Test
    public void calculatorTest(){
        BigDecimal MathiasTax = TaxCalculator.calculateTax(Mathias);
        assertEquals(2550, MathiasTax.intValue());

        BigDecimal WunmiTax = TaxCalculator.calculateTax(Adewunmi);
        assertEquals(3750, WunmiTax.intValue());
    }

    @Test
    public void calculateExcessTax(){
        BigDecimal DeolaTax = TaxCalculator.calculateTax(Adeola);
        assertEquals(7500, DeolaTax.intValue());
    }
}
