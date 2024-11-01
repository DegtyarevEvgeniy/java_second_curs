package Prak7;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Введите сторону 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Введите сторону 3: ");
        double side3 = scanner.nextDouble();
        System.out.print("Введите цвет треугольника: ");
        String color = scanner.next();
        System.out.print("Закрашен ли треугольник (true/false): ");
        boolean isFilled = scanner.nextBoolean();


        Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);

        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Цвет: " + triangle.getColor());
        System.out.println("Закрашен: " + triangle.isFilled());

        scanner.close();
    }
}
