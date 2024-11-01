package Prak7;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;


    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalArgumentException("Сумма длин любых двух сторон должна быть больше длины третьей стороны.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() { return "Треугольник: сторона1 = " + side1 + " сторона2 = " + side2 + " сторона3 = " + side3;}
}
