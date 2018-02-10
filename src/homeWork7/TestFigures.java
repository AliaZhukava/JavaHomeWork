package homeWork7;

public class TestFigures {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 2, 6, 4, 90);
        Square square = new Square(1, 2, 10);
        Rectangle rectangle = new Rectangle(1, 2, 10, 5);
        Circle circle = new Circle(5, 5, 5);
        Quadrilateral quadrilateral = new Quadrilateral(0, 0, 6,3, 30);

        System.out.println(triangle.toString());
        System.out.println(square.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(quadrilateral.toString());

        System.out.println("Площаль треугольника: " + triangle.area());
        System.out.println("Площаль квадрата: " + square.area());
        System.out.println("Площаль окружности: " + circle.area());
        System.out.println("Площаль прямоугольника: " + rectangle.area());
        System.out.println("Площаль четырехугольника: " + quadrilateral.area());

        System.out.println("Равны ли площади прямоугольника и четырехугольника: " + rectangle.isTheSameArea(quadrilateral));

        System.out.println("Является ли объект прямоугльником: " + ShapeUtils.isRectangle(square));
        System.out.println("Является ли объект треугльником: " + ShapeUtils.isTriangle(circle));

    }
}
