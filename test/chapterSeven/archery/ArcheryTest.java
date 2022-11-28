package chapterSeven.archery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArcheryTest {
    private Archery game;
    @BeforeEach
    public void setup() {
        game = new Archery(1);
    }

    @Test
    public void testThatArcheryGameExists() {
        Archery game = new Archery(4);
        assertNotNull(game);
    }
    @Test
    public void testThatPlayersCanExistInArcheryGame() {
        Player[] players = game.getPlayers();
        assertNotNull(players);
        assertTrue(players.length > 0);
    }
    @Test
    public void testThatArcheryGameHasPlayer() {
        Player[] players = game.getPlayers();
        Player player = players[0];
        assertNotNull(player);
    }

}
