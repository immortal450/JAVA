package lab_2;
import java.util.Scanner;

class java9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");
        
        int a, b;
        String largest;

        System.out.println("Enter the first number (a): ");
        a = sc.nextInt();

        System.out.println("Enter the second number (b): ");
        b = sc.nextInt();

        System.out.println("\nYou entered:");
        System.out.println("a = " + a + " b = " + b);

        largest = (a > b) ? "a is largest" : "b is largest";

        System.out.println("\nLargest number using conditional operator...");
        System.out.println(largest);
    }
}
