package com.company;

import static com.company.Triangle.area;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 6.0;
        triangle.b = 7.0;
        triangle.c = 8.0;
        area(triangle.a,triangle.b,triangle.c);
    }
}
