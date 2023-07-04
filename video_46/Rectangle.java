public class Rectangle extends Figure {
    void area() {
        System.out.println("The area is 20");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
        // Figure f = new Rectangle();
        // f.area();
        // f.draw();
    }
}
