package HomeWork6.src;

public class Rectangle {

    private Point pointBottomRight;
    private Point pointTopLeft;

    public Rectangle(Point pointBottomLeft, Point pointTopRight) {
        this.pointBottomRight = pointBottomLeft;
        this.pointTopLeft = pointTopRight;
    }

    public void rectangleSquare(Point pointTopLeft, Point pointBottomRight) {
        System.out.println("Площадь прямоугольника " + ((pointBottomRight.getX() - pointTopLeft.getX())
                * (pointTopLeft.getY() - pointBottomRight.getY())));
    }

    public void diagonal(Point pointTopLeft, Point pointBottomRight) {
        System.out.println("Диагональ прямоугольника " + pointBottomRight.distance(pointTopLeft));
    }

    public Point getPointBottomRight() {
        return pointBottomRight;
    }

    public void setPointBottomRight(Point pointBottomRight) {
        this.pointBottomRight = pointBottomRight;
    }

    public Point getPointTopLeft() {
        return pointTopLeft;
    }

    public void setPointTopLeft(Point pointTopLeft) {
        this.pointTopLeft = pointTopLeft;
    }
}
