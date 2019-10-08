package com.havensclass.shapes;

public class Triangle extends Shape {
    private double base, height, leg1, leg2;

    public Triangle(Point vertex, double base, double height, double leg1, double leg2){
        this.base = base;
        this.height = height;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.position = vertex;
    }

    @Override
    double computeArea() {
        return (0.5) * base * height;
    }

    @Override
    double computePerimeter() {
        return base + leg1 + leg2;
    }
}
