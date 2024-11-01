package Prak7;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];


        objects[0] = new Circle(2.0);
        objects[1] = new Rectangle(3.0, 4.0);
        objects[2] = new Square(5.0);
        objects[3] = new Square(2.5);
        objects[4] = new Circle(3.5);


        for (GeometricObject obj : objects) {
            System.out.println(obj);
            System.out.println("Площадь: " + obj.getArea());


            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}
