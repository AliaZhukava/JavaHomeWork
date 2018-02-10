package homeWork7;

public class Circle extends Figure {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return " Окружность" +
                " Координата X=" + this.getX() +
                " Координата Y=" + this.getY() +
                " Радиус=" + radius +
                " Площадь круга=" + this.area();
    }

    public int getRadius() {
        return radius;
    }
}
