package chapterEight.ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static chapterEight.ticTacToe.Mark.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private TicPlayer player1;
    private TicPlayer player2;
    private TicBoard board;
    private Mark mark;

    @BeforeEach
    public void setUp() {
        player1 = new TicPlayer(X, "Martha");
        player2 = new TicPlayer(O,"Jerry");
        board = new TicBoard();
    }
    @Test
    public void testThatPlayerCanBeCreated(){
        assertNotNull(player1);
        assertNotNull(player2);
    }

    @Test
    public void testThatBoardExists(){
        assertNotNull(board);
    }
    @Test
    public void testThatPlayerCanHaveAMark() {
        assertEquals(X, player1.getAMark());
        assertEquals(O, player2.getAMark());
    }

    @Test
    public void testThatBoardIsEmpty() {
        var floor = board.getFloor();
        assertEquals(E, floor[0][0]);
        assertEquals(E, floor[0][1]);
        assertEquals(E, floor[0][2]);
        assertEquals(E, floor[1][0]);
        assertEquals(E, floor[1][1]);
        assertEquals(E, floor[1][2]);
        assertEquals(E, floor[2][0]);
        assertEquals(E, floor[2][1]);
        assertEquals(E, floor[2][2]);
    }

    @Test
    public void testThatPlayerCanPlaceAMarkOnAPositionOnTheBoard() {
        var floor = board.getFloor();
        player1.play(1, board);
        assertEquals(X, floor[0][0]);

    }


}