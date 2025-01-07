package lab_2;
import java.util.Scanner;

public class java8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        boolean x, y, z;

        System.out.println();
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println();
        System.out.println("Working of relational operators...");
        System.out.println();

        x = (a < b) || (a > c);
        System.out.println("(a < b) || (a > c) is " + x);

        y = (a < b) && (a > c);
        System.out.println("(a < b) && (a > c) is " + y);

        z = !(b > c);
        System.out.println("!(b > c) is " + z);
    }
}
