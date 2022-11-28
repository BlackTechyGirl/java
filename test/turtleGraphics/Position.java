package turtleGraphics;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;

    }
    @Override
    public boolean equals(Object o){
        Position compared = (Position) o;
        if (compared.row == this.row && compared.column == this.column)
            return true;
        else return false;
    }

    public int getColumn() {
        return column;

    }

    public void setColumn(int column) {
        this.column = column;

    }
}
