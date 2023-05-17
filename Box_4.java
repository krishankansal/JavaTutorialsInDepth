public class Box_4 {
    // Instance variables or properties of class
    double width;
    double height;
    double depth;

    Box_4() {
    }

    // This will fired automatically
    Box_4(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return this.width * this.height * this.depth;
    }

    public static void main(String[] args) {
        Box_4 ob = new Box_4(10, 10, 10);
        // System.out.println(ob.depth);
        System.out.println("Volume of ob = " + ob.volume());

        Box_4 ob1 = new Box_4(20, 20, 20);
        System.out.println("Volume of ob1 = " + ob1.volume());

        Box_4 ob2 = new Box_4();
        System.out.println(ob2.depth);

    }
}
