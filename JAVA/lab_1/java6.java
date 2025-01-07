package lab_1;

public class java6 {

    public static void main(String args[]) {
        int a = 50, b = 60, x = 30, y = 30;
        boolean L, G, LE, GE, E, NE;
        
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");

        System.out.println("a =" +a);
        System.out.println("b =" +b);
        System.out.println("x ="+x);
        System.out.println("y =" +y);
        System.out.println();
        L = a < b;
        G = a > b;
        LE = a <= b;
        GE = x >= y;
        E = x ==y;
        NE = a != b ;
        System.out.println("a < b is " + L);
        System.out.println("a > b is " + G);
        System.out.println("a <= b is " + LE);
        System.out.println( "x>= y is" +GE);
        System.out.println( "x== y is" +E);
        System.out.println("a != b is " + NE);
}
}
