// swapping of two numbers
public class A {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + ", y = " + y);
        int temp;
        temp = x;
        x = y;
        y = x;
        System.out.println("After swapping...");
        System.out.println("x = " + x + ", y = " + y);
    }
}
