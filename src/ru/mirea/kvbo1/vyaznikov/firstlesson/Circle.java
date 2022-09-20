package ru.mirea.kvbo1.vyaznikov.firstlesson;

public class Circle {
    private double radius;
    private String colour;
    private double x;
    private double y;


    public Circle(double radius, double x, double y, String colour) {
        this.radius = radius;
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

    public void printAllInfo() {
        System.out.println("Area: " + this.getArea() + "\nLength: " + this.getLength());
        System.out.println(this + "\n");
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getLength() {
        return 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
