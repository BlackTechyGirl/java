//package snacks;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class DiaryTest {
//    Diary myDiary;
//    @BeforeEachA
//    public void setUP(){
//        myDiary = new Diary("Nen", "correctPassword");
//    }
//
//    @Test
//    public void diaryExistTest(){
//        assertNotNull(myDiary);
//    }
//
//    @Test
//    public void newDiaryIsLocked(){
//        assertTrue(myDiary.isLocked());
//    }
//
//    @Test
//    public void lockedDiaryCanBeUnlocked(){
//        assertTrue(myDiary.isLocked());
//        myDiary.unlockWith("correctPassword");
//        assertFalse(myDiary.isLocked());
//    }
//
//    @Test
//    public void wrongPasswordCannotUnlockDiaryTest(){
//        assertTrue(myDiary.isLocked());
//        myDiary.unlockWith("wrongPassword");
//        assertTrue(myDiary.isLocked());
//    }
//
//    @Test
//    public void diaryCanBeLockedTest(){
//        myDiary.unlockWith("correctPassword");
//        assertFalse(myDiary.isLocked());
//        myDiary.lock();
//        assertTrue(myDiary.isLocked());
//    }
//
//    @Test
//    public void happeningsCanBeAddedToTheDiaryTest(){
//        myDiary.unlockWith("correctPassword");
//        assertFalse(myDiary.isLocked());
//
//        myDiary.write("I had a lovely day","I was at the semicolon village." );
//
//        assertEquals(1, myDiary.numberOfEntries());
//    }
//
//    @Test
//    public void entriesCannotBeAddedWhenDiaryIsLockedTest(){
//        assertTrue(myDiary.isLocked());
//        myDiary.write("I had a lovely day","I was at the semicolon village." );
//
//        assertEquals(0, myDiary.numberOfEntries());
//    }
//
//    @Test
//    public void entriesCanBeFoundByIdTest(){
//        myDiary.unlockWith("correctPassword");
//        assertFalse(myDiary.isLocked());
//
//        myDiary.write("I had a lovely day","I was at the semicolon village." );
//        assertEquals(1, myDiary.numberOfEntries());
//
//        Entry foundEntry = myDiary.findEntryWithId(1);
//
//        assertEquals(1, foundEntry.getId());
//        assertEquals("I had a lovely day",foundEntry.getTitle());
//        assertEquals("I was at the semicolon village.", foundEntry.getBody());
//    }
//
////    @Test
////    public void happeningsCanBeRemovedFromTheDiaryTest(){
////        myDiary.unlockWith("correctPassword");
////        assertFalse(myDiary.isLocked());
////        myDiary.write("today", "i love rice.");
////        myDiary.delete();
////        assertTrue(true);
////    }
//
//}