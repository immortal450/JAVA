package LAB;
class Box {
    double width, height, depth;
}

class BoxDemo1 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        System.out.println("Name: Divyanshu Kumar, Roll Number: 2330441");
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume: " + vol);
    }
}
