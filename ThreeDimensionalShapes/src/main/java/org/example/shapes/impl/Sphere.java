package org.example.shapes.impl;

import org.example.shapes.Figure;

public class Sphere implements Figure {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public double square() {
        return 4 * Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
