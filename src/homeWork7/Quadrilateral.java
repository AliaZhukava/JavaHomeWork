package homeWork7;

public class Quadrilateral extends Figure {

    private int base;
    private int edge;
    private int angle;

    public Quadrilateral(int x, int y, int base, int edge, int angle) {
        super(x, y);
        this.base = base;
        this.edge = edge;
        this.angle = angle;
    }

    public Quadrilateral(int x, int y, int base, int edge) {
        super(x, y);
        this.base = base;
        this.edge = edge;
    }

    public Quadrilateral(int x, int y, int base) {
        super(x, y);
        this.base = base;
    }

    @Override
    public double area() {
        double sinAngle = Math.sin(Math.toRadians(angle));
        double height = this.edge * sinAngle;

        return height * this.base;
    }

    @Override
    public String toString() {
        return " Четырехугольник: " +
                " Координанта X = " + this.getX() +
                " Координанта Y = " + this.getY() +
                " Длина основания = " + this.getBase() +
                " Длина ребра = " + this.getEdge() +
                " Угол между сторонами = " + this.getAngle() +
                " Площадь четырехугольника = " + this.area();
    }

    public int getBase() {
        return base;
    }

    public int getEdge() {
        return edge;
    }

    public int getAngle() {
        return angle;
    }
}
