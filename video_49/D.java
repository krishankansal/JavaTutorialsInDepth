public interface D {

    void draw();

    void scale();

}

abstract class E implements D {

    public void draw() {
        System.out.println("draw() called");
    }
}