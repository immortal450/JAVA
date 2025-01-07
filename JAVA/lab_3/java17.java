package lab_3;
/*Write a Java program to print a table of values of the function y = e−x
for x varying from 0 to 1 in steps of 0.1. The table appears as follows.
x = 0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
there for what will y */
//use for loop to print table of values of the function y = e^(−x)
public class java17 {
    public static void main(String[] args) {
        
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");

        double x = 0.0;
        double y = 0.0;
        for (int i = 0; i <= 10; i++) {
            x = i * 0.1;
            y = Math.exp(-x);
            System.out.println("x = " + x + " y = " + y);
            }
            }
}

