package chapterSeven.archery;

public class Archery {

    private  Player[] players;
    public Archery(int numberOfArchers) {
        players = new Player[numberOfArchers];
        for (int i = 0; i < numberOfArchers; i++) {
            players[i] = new Player();
        }
    }
    public  Player[] getPlayers() {
        return players;
    }
}
