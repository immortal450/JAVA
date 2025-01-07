package lab_2;
import java.util.Scanner;
public class java13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator :- +,-,*,/");
        String op = sc.next();

        switch (op) {
            
            case "+":
            System.out.println("Addition of two number is " + (num1 + num2));
            break;

            case "-":
            System.out.println("Subtraction of two number is " + (num1 - num2));
            break;

            case "*":
            System.out.println("Multiplication of two number is " + (num1 * num2));
            break;

            case "/":
            if (num2 != 0) {
                System.out.println("Division of two number is " + (num1 / num2));
                }

            else {
                System.out.println("Error! Division by zero is not allowed.");
                }
            break;

            default:
                System.out.println("Invalid operator");
        }

    }
}

    