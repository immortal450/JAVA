//find the area of the circle, trangle and rectangle using inheritance method in java 
//take the radius of the circle, base and height of the triangle and length and breadth of the rectangle as the input from the user
//also take the choice from the user to find the area of the circle, triangle and rectangle

import java.util.Scanner;

class Shape {
    double area;
    void display() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
        area = 3.14 * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        area = 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length, breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth;
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: ");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                Circle c = new Circle(radius);
                c.display();
                break;
            case 2:
                System.out.println("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                Triangle t = new Triangle(base, height);
                t.display();
                break;
            case 3:
                System.out.println("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.println("Enter the breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                Rectangle r = new Rectangle(length, breadth);
                r.display();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
