import LAB.Rectangle;

class Rectangle {

    int height, width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        int area = this.height * this.width;
    }

    // Method to display the rectangle's dimensions
    void display() {
        System.out.println("Height = " + this.height);
        System.out.println("Width = " + this.width);
        System.out.println("Area = " + area);
    }
}

class Pctor {

    public static void main(String args[]) {
        Rectangle rec = new Rectangle(5, 10);

        rec.display();
    }
}
