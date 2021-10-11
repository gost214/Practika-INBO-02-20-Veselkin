package Pract3;

public class MovableCircle implements Movabale{
    private int radius;
    private MovabalePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovabalePoint(x, y , xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle " +
                "radius=" + radius +
                ", center=" + center;
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }
}