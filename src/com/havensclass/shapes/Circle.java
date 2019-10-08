package com.havensclass.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(Point center, double radius) {
        this.radius = radius;
        this.position = center;
    }

    @Override
    public double computeArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double computePerimeter() {
        return (Math.PI * 2 * radius);
    }
}