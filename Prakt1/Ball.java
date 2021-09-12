package Prakt1;

public class Ball {

    private String colour;
    private int size;
    public Ball(String n, int a){
        colour = n;
        size = a;
    }
    public Ball(String n){
        colour = n;
        size = 0;
    }
    public Ball(){
        colour = "Colour";
        size = 0;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void setColour (String colour) {
        this.colour = colour;
    }
    public String getColour(String colour){
        return colour;
    }
    public int getSize() {
        return size;
    }
    public String toString(){
        return this.colour+this.size;
    }
    public void goOut2(){
        System.out.println("The ball is "+colour+" and "+size+" sm");
    }
}
