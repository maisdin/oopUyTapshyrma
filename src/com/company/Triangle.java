package com.company;

public class Triangle {
    Double a;
    Double b;
    Double c;

    static void area(double a,double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.print("Area: " + s);
    }
}
