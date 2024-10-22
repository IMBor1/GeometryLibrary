package com.test.GeometryLibrary;

public class Rectangle implements Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
}
