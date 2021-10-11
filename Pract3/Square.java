package Pract3;

public class Square extends Rectangle {
    protected
    double side;

    public Square() {
        super(1.0, 2.0, "RED", false);
    }

    public Square(double side) {
        super(1.0, 2.0, "RED", false);
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(1.0, 2.0, "RED", false);
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square " +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return (side) * 4;

    }
}