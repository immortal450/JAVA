package LAB;
class Rectangle {
    int height;
    int width;
    String s;
    Rectangle () {
height = 10; width = 15;
}

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Output of s = " + s);
    }
}

public class javal4_1 {
    public static void main(String args[]) {
        Rectangle rec = new Rectangle();
        rec.display();
    }
}
