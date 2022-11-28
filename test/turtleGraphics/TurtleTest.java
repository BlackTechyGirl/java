package turtleGraphics;

import chapterSeven.turtle.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    private Turtle ijapa;

    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
    }
    @Test
    public void turtleExistsTest(){
        assertNotNull(ijapa);
    }
    @Test
    public void turtleCanMovePenUpTest(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }
    @Test
    public void turtleCanMovePenDownTest(){
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }
    @Test
    public void turtleCanTurnPenRightFacingEastTest(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

    }
    @Test
    public void turtleCanTurnPenRightWhileFacingSouthTest(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());

    }
    @Test
    public void turtleCanTurnPenRightWhileFacingEastTest(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());


        ijapa.move(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());

    }

}
