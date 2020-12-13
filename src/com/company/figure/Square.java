package com.company.figure;

public class Square extends Figure {
    private static final String NAME = "Square";

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
