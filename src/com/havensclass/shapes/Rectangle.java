package com.havensclass.shapes;

public class Rectangle extends Shape {

    private double length, height;

    Rectangle(Point upperLeft, double length, double height) {
        this.position = upperLeft;
        this.length = length;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return (length * height);
    }

    @Override
    public double computePerimeter() {
        return (length * 2) + (height * 2);
    }
}