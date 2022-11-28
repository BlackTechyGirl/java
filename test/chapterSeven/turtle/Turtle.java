package chapterSeven.turtle;

import chapterSeven.turtle.Pen;
import turtleGraphics.Direction;
import turtleGraphics.Position;

import static turtleGraphics.Direction.*;

public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle() {
        pen.penUp();
        currentDirection = EAST;
        currentPosition = new Position(0, 0);
    }
    public void penUp() {
        pen.penUp();
    }

    public boolean isPenUp() {
        return pen.isPenUp();
    }

    public void penDown() {
        pen.penDown();

    }

    public void turnRight() {
        switch(currentDirection){
            case SOUTH -> face(WEST);
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);


        }
    }
    private void face(Direction direction) {//UTILITY METHOD
        currentDirection = direction;

    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> face(NORTH);
            case WEST -> face(EAST);
            case NORTH -> face(SOUTH);
            case SOUTH -> face(WEST);


        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void move(int numberOfSteps) {
        switch (currentDirection) {
            case EAST -> {
                currentPosition.setColumn(currentPosition.getColumn()+numberOfSteps);

            }
        }
    }
}
