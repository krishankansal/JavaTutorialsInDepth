public class Box_2 {
    // Instance variables or properties of class
    double width;
    double height;
    double depth;

    void setDimensions(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    void volume() {
        double vol = width * height * depth;
        System.out.println("The volume is = " + vol);
    }

    public static void main(String[] args) {
        Box_2 ob = new Box_2();
        ob.setDimensions(15, 25, 35);
        ob.volume();

        Box_2 ob1 = new Box_2();
        ob1.setDimensions(17, 23, 21);
        ob1.volume();

    }
}
