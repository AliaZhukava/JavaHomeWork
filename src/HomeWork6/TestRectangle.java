package HomeWork6;

import HomeWork6.src.Point;
import HomeWork6.src.Rectangle;

public class TestRectangle {

    public static void main(String[] args) {
        Point pointTopLeft = new Point(2, 4);
        Point pointBottomRight = new Point(6, 2);

        Rectangle rectangle = new Rectangle(pointTopLeft, pointBottomRight);

        rectangle.rectangleSquare(pointTopLeft, pointBottomRight);

        rectangle.diagonal(pointTopLeft, pointBottomRight);
    }
}
