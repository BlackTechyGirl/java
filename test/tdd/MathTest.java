package tdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    @Test
    public void testSquareFunction(){
        Math math = new Math();
        int result = math.squareOf(9);
        assertEquals(25, math.squareOf(5));
        assertEquals(625, math.squareOf(25));
        assertEquals(49, math.squareOf(7));

    }

    @Test
    public void testAddFunction(){
       Math math = new Math();
       assertEquals(5, math.add(2, 3));
   }

    @Test
    public void testEvenNumberFunction(){
        Math math = new Math();
      assertEquals(true, math.isEven(2));
  }

}