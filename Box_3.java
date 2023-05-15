public class Box_3 {
    // Instance variables or properties of class
    double width;
    double height;
    double depth;

    void setDimensions(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    double volume() {
        return this.width * this.height * this.depth;
    }

    public static void main(String[] args) {
        Box_3 ob = new Box_3();
        ob.setDimensions(10, 10, 10);
        System.out.println("Volume of ob = " + ob.volume());

        Box_3 ob1 = new Box_3();
        ob1.setDimensions(20, 20, 20);
        System.out.println("Volume of ob1 = " + ob1.volume());

    }
}
