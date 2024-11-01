package Prak7;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5.0, "Красный", true);
        ComparableCircle circle2 = new ComparableCircle(3.0, "Синий", false);

        System.out.println("Больше из двух кругов: " + GeometricObject.max(circle1, circle2).getArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0, "Зеленый", true);
        System.out.println("Больше между кругом и прямоугольником: " +
                GeometricObject.max(circle1, rectangle).getArea());
    }
}
