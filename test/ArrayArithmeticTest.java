import org.junit.jupiter.api.*;
import tdd.ArrayArithmetic;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayArithmeticTest {

    @Test
    public void findTheSumOfAnArray(){
        int [] arr = new int[]{1, 2, 3, 4, 5};
        int arraySum = ArrayArithmetic.sumOfArray(arr);
        assertEquals(15, arraySum);
    }
    @Test
    public void findTheMinimumOfAnArray(){
        int [] arr = new int[]{1, 2, 3, 4, 5};
        int arrayMinimum = ArrayArithmetic.minimumOfArray(arr);
        assertEquals(1, arrayMinimum);
    }
    @Test
    public void findTheMaximumOfAnArray(){
        int [] arr = new int[]{1, 2, 3, 4, 5};
        int arrayMaximum = ArrayArithmetic.maximumOfArray(arr);
        assertEquals(5, arrayMaximum);
    }
    @Test
    public void sumOfMinimumOfAnArray(){
        int [] arr = new int[]{5, 2, 3, 1, 4};
        int arrayMaximum = ArrayArithmetic.sumMin(arr);
        assertEquals(10, arrayMaximum);
    }
    @Test
    public void sumOfMaximumOfAnArray(){
        int [] arr = new int[]{5, 2, 3, 1, 4};
        int arrayMaximum = ArrayArithmetic.sumMax(arr);
        assertEquals(14, arrayMaximum);
    }
    @Test
    public void setArrayToAscendingOrder(){
        int [] arr = new int[]{5, 2, 3, 1, 4};
        int[] arrayAccend = ArrayArithmetic.accendArray(arr);
        assertEquals(arr,arrayAccend);
    }
    @Test
    public void setArrayToDescendingOrder(){
        int [] arr = new int[]{5, 2, 3, 1, 4};
        int[] arrayDescend = ArrayArithmetic.decendArray(arr);
        assertArrayEquals(arr,arrayDescend);
    }
}

