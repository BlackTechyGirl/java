package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheCrapsGameTest {

        @Test
        public void startCrapsGameTest(){
            TheCrapsGame craps = new TheCrapsGame();
            craps.play();
//        assertEquals(6, craps.play());
        }
        public void gameStatusTest(){
            TheCrapsGame craps = new TheCrapsGame();
        }
}
