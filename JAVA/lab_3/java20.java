package lab_3;
/*Write a Java program to find whether a number is an Armstrong number
or not. (Hint: A number is an Armstrong number if the sum of the cubes
of the digits of the number is equal to the number itself. For example,
153 = 1 + 125 + 27).*/
//import scanner
import java.util.Scanner;
public class java20 {
    public static void main(String[] args) {
        
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");

        //declare variable
        int num, sum = 0, temp, digit;
        Scanner sc = new Scanner(System.in);
        //input number
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        //find the sum of the cubes of the digits of the number
        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            sum = sum + (int) Math.pow(digit, 3);
            temp = temp / 10;
            }
            //check whether the number is an Armstrong number or not
            if (num == sum) {
                System.out.println(num + " is an Armstrong number");
                } else {
                    System.out.println(num + " is not an Armstrong number");
            }
        }
}