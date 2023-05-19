public class OverloadingOne {

    void display() {
        System.out.println("display() called");
    }

    void display(int a) {
        System.out.println("display(int a)  called");
    }

    int display(int a) {
        return a + 10;
    }

    void display(byte a) {
        System.out.println("display(byte a) called");
    }

    void display(float f) {
        System.out.println("display(float f) called");
    }

    void display(double f) {
        System.out.println("display(double f) called");
    }

    void display(int a, int b) {
        System.out.println("display(int a, int b)  called");
    }

    public static void main(String[] args) {
        OverloadingOne ob = new OverloadingOne();
        ob.display((byte) 23);

    }

}
