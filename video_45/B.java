public class B extends A {
    int x = 200;

    void authentication() {
        super.authentication();
        System.out.println("Step 4");
        System.out.println("Step 5");
        System.out.println("Step 6");
        super.calc();
    }

    void show() {
        System.out.println("sub x = " + x);
        System.out.println("super x = " + super.x);
    }

    public static void main(String[] args) {
        B ob = new B();
        // ob.authentication();
        ob.show();
    }

}
