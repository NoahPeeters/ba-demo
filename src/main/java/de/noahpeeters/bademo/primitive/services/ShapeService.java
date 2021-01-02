package de.noahpeeters.bademo.primitive.services;

public class ShapeService {
    public double triangleCircumference(double a, double b, double c) {
        return a + b + c;
    }

    public double triangleArea(double a, double b, double angleC) {
        return a * b * 0.5 * Math.sin(angleC);
    }
}
