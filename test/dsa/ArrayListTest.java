package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {
    @Test
    public void addItemListSizeIncreasesTest(){
//        todo given i have a list
        MyArrayList guitarstrings = new MyArrayList();
//        todo when i add an item
        guitarstrings.add("G-string");
        guitarstrings.add("F-string");
//         todo check that size size has increased
//         assertEquals(2, guitarstrings.size());
    }
}
