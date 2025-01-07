package lab_1;
import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double length,width,perimeter,area;
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");
        System.out.println("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        width = sc.nextDouble();
        perimeter = 2 * (length + width);
        area = length * width;
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);
        }
        }
