package LAB;
import java.util.Scanner;
public class Complex {
    double x, y;
    Complex() {
        x = 0;
        y = 0;
    }
    Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part of the complex number: ");
        x = sc.nextDouble();
        System.out.println("Enter the imaginary part of the complex number: ");
        y = sc.nextDouble();
    }
    void display() {
        System.out.println("The complex number is: " + x + " + i" + y);
    }
    Complex sum(Complex c) {
        Complex temp = new Complex();
        temp.x = x + c.x;
        temp.y = y + c.y;
        return temp;
    }
    Complex product(Complex c) {
        Complex temp = new Complex();
        temp.x = x * c.x - y * c.y;
        temp.y = x * c.y + y * c.x;
        return temp;
    }
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.accept();
        c2.accept();
        c1.display();
        c2.display();
        Complex sum = c1.sum(c2);
        Complex product = c1.product(c2);
        System.out.println("The sum of the two complex numbers is: ");
        sum.display();
        System.out.println("The product of the two complex numbers is: ");
        product.display();
        System.out.println("Name: Divyanshu Kumar, Roll Number: 2330441");
    }
}