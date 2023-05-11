public class Box {
    // Instance variables or properties of class
    double width;
    double height;
    double depth;

    public static void main(String[] args) {
        Box ob = new Box();
        ob.depth = 15;
        ob.height = 25;
        ob.width = 35;

        Box ob1 = new Box();
        ob1.width = 17;
        ob1.height = 23;
        ob1.depth = 21;
        System.out.println(ob.depth);
        System.out.println(ob1.depth);

    }
}
