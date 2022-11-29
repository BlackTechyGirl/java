package snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;
    @BeforeEach
    public void setUp(){
        diary = new Diary("amirah", "correctPassword");
    }
    @Test
    public void diaryExistTest() {
        assertNotNull(diary);
    }
    @Test
    public void newDiaryIsLockedTest() {
        assertTrue(diary.isLocked());
    }
    @Test
    public  void lockedDiaryCanBeUnlockedTest() {
        assertTrue(diary.isLocked());
        diary.unlockWith("correctPassword");
        assertFalse(diary.isLocked());
    }
    @Test
    public void wrongPasswordCannotUnlockDiaryTest() {
        assertTrue(diary.isLocked());
        diary.unlockWith("wrongpassword");
        assertTrue(diary.isLocked());
    }
    @Test
    public void diaryCanBeLockedTest() {
        diary.unlockWith("correctPassword");
        assertFalse(diary.isLocked());
        diary.lock();
    }
}
