package Pract3;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape (String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    protected Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "Shape:"+'\'' +
                "color='" + color + '\'' +
                ", filled=" + filled;
    }
    abstract double getArea();

    abstract double getPerimeter();
}
