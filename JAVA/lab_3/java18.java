package lab_3;
//Write a Java program to find the largest of three numbers using a conditional operator.
//take input from user
// import scanner

public class java18 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        int max = (a > b) ? ((a > c) ? a : c)
        : ((b > c) ? b : c);
        System.out.println("Largest number is " + max);
        }
        }
