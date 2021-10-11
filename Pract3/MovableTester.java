package Pract3;

public class MovableTester {

        public static void main(String[] args) {


            MovableCircle k = new MovableCircle(1, 0, 1, 2, 5);
            k.moveUp();
            k.moveLeft();
            MovableCircle k2 = new MovableCircle(2,1,3,2,6);
            k2.moveDown();
            k2.moveRight();
            System.out.println(k);
            System.out.println(k2);
            MovabalePoint recPoint1 = new MovabalePoint(1, 1, 1, 1);
            MovabalePoint recPoint2 = new MovabalePoint(2, 2, 2, 2);

            MovableRectangle rec = new MovableRectangle(7, 7, 13, 1, 3, 3, recPoint1, recPoint2);
            System.out.println(rec.toString());
            System.out.println(recPoint1.toString());
            System.out.println(recPoint2.toString());

            recPoint1.moveRight();
            System.out.println(rec.toString());
        }

}
