public abstract class Figure {
    Figure() {
        System.out.println("Figure constructor called");
    }

    void draw() {
        System.out.println("Image drawn");
    }

    static void color() {
        System.out.println("Image colored");
    }

    void rotate() {
        System.out.println("Rotate now");
    }

    abstract void area();
}