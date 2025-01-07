package lab_3;
//Write a simple Java program to show a Fibonacci series.
public class java21 {
    public static void main(String[] args) {
        int n = 10; // number of terms in the series
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

