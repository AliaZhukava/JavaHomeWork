package homeWork7;

public class Square extends Quadrilateral {

    public Square(int x, int y, int base) {
        super(x, y, base);
    }

    @Override
    public double area() {
        return Math.sqrt(this.getBase());
    }

    @Override
    public String toString() {
        return " Квадрат: " +
                " Координанта X = " + this.getX() +
                " Координанта Y = " + this.getY() +
                " Длина стороны = " + this.getBase() +
                " Площадь квадрата = " + this.area();
    }
}
