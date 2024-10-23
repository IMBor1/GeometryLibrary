package org.example.shapes.impl;

import org.example.shapes.Figure;

public class Piramide implements Figure {
    private double baseSide;
    private double height;
    private double lateralSide;

    public Piramide(double baseSide, double height, double lateralSide) {
        this.baseSide = baseSide;
        this.height = height;
        this.lateralSide = lateralSide;
    }
    @Override
    public double square() {
        return (baseSide * height) + (0.5 * 4 * baseSide * lateralSide);
    }
    @Override
    public double perimeter() {
        return 4 * baseSide;
    }
}
