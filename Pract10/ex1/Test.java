package Pract10.ex1;

public class Test {
    public static void main(String[] args) {
        Concrete concreteFactory = new Concrete();
        Complex complex = concreteFactory.CreateComplex(10,-2);
        System.out.println(complex);
    }
}