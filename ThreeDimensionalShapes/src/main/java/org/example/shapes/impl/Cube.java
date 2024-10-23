package org.example.shapes.impl;

import org.example.shapes.Figure;

public class Cube implements Figure {
    private double side;

    public Cube(double side) {
        this.side = side;
    }
    @Override
    public double square() {
        return 6 * side * side;
    }
    @Override
    public double perimeter() {
        return 12 * side;
    }

    public double volume(){
        return Math.pow(side, 3);
    }
}
