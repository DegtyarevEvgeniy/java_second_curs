package Prak7;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "белый";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }


    public GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public boolean isFilled() {
        return filled;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public Date getDateCreated() {
        return dateCreated;
    }


    public String toString() {
        return "создан " + dateCreated + ",\nцвет: " + color + ", заливка: " + filled;
    }


    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }


    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        return (obj1.compareTo(obj2) >= 0) ? obj1 : obj2;
    }


    public abstract double getArea();


    public abstract double getPerimeter();
}
