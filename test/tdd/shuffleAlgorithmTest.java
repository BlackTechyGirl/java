package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class shuffleAlgorithmTest {
    @Test
    public void testForShuffleAlgorithm(){
        int [] arr = new int[6];
        int [] shuffle = Shuffle.shuffleArrays(arr);
        assertNotEquals(new int[]{1,2,3,4,5,6}, shuffle);

    }

}
