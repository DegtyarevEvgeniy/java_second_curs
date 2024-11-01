package Prak7;

public class TestMax {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(3.0);
        Rectangle rectangle1 = new Rectangle(2.0, 4.0);
        Rectangle rectangle2 = new Rectangle(3.0, 5.0);

        GeometricObject maxCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Больше из двух кругов: " + maxCircle.getArea());

        GeometricObject maxRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Больше из двух прямоугольников: " + maxRectangle.getArea());
    }
}
