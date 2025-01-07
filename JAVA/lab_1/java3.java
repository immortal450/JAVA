package lab_1;
import java.util.Scanner;

public class java3 {

    public static void main(String[] args) {
        double r;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");
        System.out.println("Enter the radius of the circle:");
        r = (double) sc.nextInt();
        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}