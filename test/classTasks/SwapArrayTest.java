package classTasks;

import classTask.ArrayProblems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapArrayTest {
    @Test
    public void swapAnArray() {
        int [] array = {1, 2};
        int [] swap = ArrayProblems.swap(array);
        assertArrayEquals(new int []{2, 1}, swap);
    }
    @Test
    public void findTheElementsOfTheOddPosition() {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] oddElements = ArrayProblems.oddElements(array);
        assertArrayEquals(new int[] {1, 0, 3, 5, 7, 9}, oddElements);
    }
    @Test
    public void findTheTwoHighestNumbersInAnArray(){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] highestNumbers = ArrayProblems.highestNumbers(array);
//        assertArrayEquals();
    }
}
