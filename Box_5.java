public class Box_5 {
    // Instance properties or instance variables of class Box_5
    double width;
    double height;
    double depth;

    // construct clone of an object
    Box_5(Box_5 ob) { // pass object to constructor
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    // Uninitialized objcect
    Box_5() {
        height = -1;
        width = -1;
        depth = -1;
    }

    // constructor used when all dimensions specified
    Box_5(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when cube is created
    Box_5(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box_5 ob1 = new Box_5();
        System.out.println("Volume of ob1 = " + ob1.volume());
        Box_5 ob2 = new Box_5(10, 20, 30);
        System.out.println("Volume of ob2 = " + ob2.volume());
        Box_5 ob3 = new Box_5(ob2);
        System.out.println("Volume of ob3 = " + ob3.volume());
        Box_5 ob4 = new Box_5(30);
        System.out.println("Volume of ob4 = " + ob4.volume());
    }
}
