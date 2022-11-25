package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the quantity of figures:");
        int N = scanner1.nextInt();
        Area[] figure = new Area[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the number of figure: ");
            System.out.println();
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            double user_input = scanner.nextDouble();
            if (user_input == 1) {
                System.out.println("Enter the radius of the circle");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                figure[i] = circle;
            } else if (user_input == 2) {
                System.out.println("Enter 2 sides of the rectangle");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(side1, side2);
                figure[i] = rectangle;
            } else if (user_input == 3) {
                System.out.println("Enter the side of the square");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                figure[i] = square;
            } else if (user_input == 4) {
                System.out.println("Enter 3 sides of the triangle");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                figure[i] = triangle;
            } else
                System.out.println("Something went wrong. Try anymore.");
        }
        for (int i = 0; i < N; i++) {
            System.out.println("Area of " + (i + 1) + " figure: " + figure[i].calculateArea());
        }
    }
}
