public class Box_1 {
    // Instance variables or properties of class
    double width;
    double height;
    double depth;

    void setWidth(double x) {
        width = x;
    }

    void setHeight(double y) {
        height = y;
    }

    void setDepth(double z) {
        depth = z;
    }

    void volume() {
        double vol = width * height * depth;
        System.out.println("The volume is = " + vol);
    }

    public static void main(String[] args) {
        Box_1 ob = new Box_1();
        ob.setDepth(15);
        ob.setHeight(25);
        ob.setWidth(35);
        ob.volume();

        Box_1 ob1 = new Box_1();
        ob1.setWidth(17);
        ob1.setHeight(23);
        ob1.setDepth(21);
        ob1.volume();

    }
}
