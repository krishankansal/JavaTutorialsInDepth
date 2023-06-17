public class A {

    static int x = 10;
    static int y;
    int a = 20;

    static void meth(int z) {
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    static {
        System.out.println("Static block called");
        y = x * 5;
    }

    public static void main(String[] args) {
        meth(40);
    }

}
