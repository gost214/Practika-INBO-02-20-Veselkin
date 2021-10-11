package Pract5;

public class Zadan7 {
    public static void recursion(int n, int d) {
        if (d > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % d == 0) {
            System.out.println(d);
            recursion(n / d, d);
        }
        else {
            recursion(n, ++d);
        }
    }
    public static void main(String[] args) {
        recursion(150, 2);
    }
}