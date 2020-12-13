package com.company.figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(3),
                new Rect(3, 4),
                new Triangle(4, 6, 4),
                new Square(5)
        };

        for (Figure f : figures) {
            System.out.println(f.getName() + ": area = " + f.getArea());
        }
    }
}
