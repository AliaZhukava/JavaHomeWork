package homeWork7;

public class Point implements Distance {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double distance(Point nextPoint) {
        return Math.sqrt(Math.pow((this.x - nextPoint.x), 2) + Math.pow((this.y - nextPoint.y), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
