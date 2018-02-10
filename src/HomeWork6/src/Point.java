package HomeWork6.src;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double distance(Point nextPoint) {
        return Math.sqrt(Math.pow((this.x - nextPoint.x), 2) + Math.pow((this.y - nextPoint.y), 2));
    }
}
