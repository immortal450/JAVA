package lab_3;
/*Write a Java program to accept a point (x, y) and find whether it lies on
the circle or inside the circle or outside the circle. The center of the circle is
(0, 0) and the radius of the circle is 5. Equation of a circle with (0, 0) as the
center and r as the radius is given by x^2 + y^2 = r^2.
1. If x^2 + y^2 < r^2, then the point (x, y) lies within the circle.
2. If x^2 + y^2 > r^2, then the point (x, y) lies outside the circle.
3. If x^2 + y^2 = r^2, then the point (x, y) lies on the circle.*/
//take input by user
//import scanner
//also take radis by user
import java.util.Scanner;
public class java19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");

        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        System.out.println("Enter the radius of the circle");
        int r = sc.nextInt();
        //check whether the point lies on the circle or inside the circle or outside the circle
        if (x * x + y * y < r * r) {
            System.out.println("The point (" + x + "," + y + ") lies within the circle");
            } else if (x * x + y * y > r * r) {
                System.out.println("The point (" + x + "," + y + ") lies outside the circle");
                } else {
                    System.out.println("The point (" + x + "," + y + ") lies on the circle");
                    }
}
}
