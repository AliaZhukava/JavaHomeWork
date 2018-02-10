package homeWork7;

public abstract class Figure extends Point {

    public Figure(int x, int y) {
        super(x, y);
    }

    public abstract double area();

    public boolean isTheSameArea(Figure figure) {
        return this.area() == figure.area();
    }
}
