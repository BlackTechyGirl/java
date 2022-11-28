package classTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DigitIdentifierTest {
    @Test
    public void testToIdentifyDigitInString() {
        DigitIdentifier digits = new DigitIdentifier();
        int digit = digits.identifyDigit("");
        assertEquals(0, digit);
    }
}
