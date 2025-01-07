package lab_1;
import java.util.Scanner;

class java2{
    @SuppressWarnings("resource")
    public static void main(String [] args ) {
        int a, b;
        
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a");
a = sc.nextInt();
System.out.println("Enter the value of b");
b = sc.nextInt();
System.out.println();
System.out.println("Integer Arithmetic");
System.out.println();
System.out.println("Sum = " + (a + b));
System.out.println("Difference = "+ (a - b));
System.out.println("Product = " + (a* b));
System.out.println("Quotient = " + (a/b));
System.out.println("Remainder = " + (a % b));
}
}














