package homeWork7;

public class Triangle extends Figure implements Height {

    private int base;
    private int edge;
    private double angle;

    public Triangle(int x, int y, int base, int edge, double angle) {
        super(x, y);
        this.base = base;
        this.edge = edge;
        this.angle = angle;
    }

    @Override
    public double area() {
        return 0.5 * Math.abs(base) * this.height();
    }

    @Override
    public double height() {
        double anglesRadians = Math.toRadians(angle);
        return Math.abs(edge) * Math.sin(anglesRadians);
    }

    @Override
    public String toString() {
        return " Треугольник: " +
                " Координата X = " + this.getX() +
                " Координата Y = " + this.getY() +
                " Основание = " + base +
                " Ребро = " + edge +
                " Угол между сторонами = " + angle +
                " Площадь треугольника = " + this.area() +
                " Высота = " + this.height();
    }

    public int getSideX() {
        return base;
    }

    public int getSideY() {
        return edge;
    }

    public double getAngle() {
        return angle;
    }
}

