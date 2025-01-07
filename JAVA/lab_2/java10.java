package lab_2;
import java.util.Scanner;

class java10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");

        System.out.println("Enter the first number (a): ");
        int a = sc.nextInt();

        System.out.println("Enter the second number (b): ");
        int b = sc.nextInt();

        int ORresult = a | b;

        System.out.println("\nBitwise OR operation:");
        System.out.println("a = " + a + " (Binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (Binary: " + Integer.toBinaryString(b) + ")");
        System.out.println("Result (a | b) = " + ORresult);
        System.out.println("Binary: " + Integer.toBinaryString(ORresult));
    }
}
