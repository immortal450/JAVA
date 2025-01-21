import java.util.Scanner;

class Triangle {
    double a, b, c;

    void acceptSides(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    void displaySides() {
        System.out.println("Sides are: " + a + ", " + b + ", " + c);
    }

    void checkType() {
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
            System.out.println("Right Angled Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}

public class tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();

        System.out.println("Enter three sides of the triangle:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        System.out.println("Name: Divyanshu Kumar, Roll Number: 2330441");


        t.acceptSides(x, y, z);
        t.displaySides();
        t.checkType();

        sc.close();
    }
}
