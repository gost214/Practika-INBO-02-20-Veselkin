package Pract3;

public class MovableRectangle implements Movabale {
    private MovabalePoint topLeft;
    private MovabalePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2,int xSpeed, int ySpeed, MovabalePoint topL, MovabalePoint bottomR) {
        this.topLeft = topL;
        topLeft.x = x1;
        topLeft.y = y1;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;

        this.bottomRight = bottomR;
        bottomRight.x = x2;
        bottomRight.y = y2;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "The coordinates of rectangle: " + topLeft.x + " " + topLeft.y + " " + bottomRight.x + " " + bottomRight.y;
    }
}

