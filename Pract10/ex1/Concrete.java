package Pract10.ex1;



public class Concrete implements ComplexAbstractFactory {


    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }
}