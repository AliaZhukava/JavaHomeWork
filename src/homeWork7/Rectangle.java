package homeWork7;

public class Rectangle extends Quadrilateral {

     public Rectangle(int x, int y, int base, int edge) {
         super(x, y, base, edge);
    }

    @Override
    public double area() {
        return this.getBase() * this.getEdge();
    }

    @Override
    public String toString() {
        return " Прямоугольник: " +
                " Координанта X = " + this.getX() +
                " Координанта Y = " + this.getY() +
                " Длина основания = " + this.getBase() +
                " Высота = " + this.getEdge() +
                " Площадь прямоугольника = " + this.area();
    }
}
