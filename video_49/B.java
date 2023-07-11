public class B implements A {

    @Override
    public void x() {
        System.out.println("X method called");

    }

    @Override
    public void y() {
        System.out.println("Y method called");
    }

    public static void main(String[] args) {
        A ob = new B();
        ob.x();
        ob.y();
    }

}
