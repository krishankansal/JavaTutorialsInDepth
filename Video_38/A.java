// Outer class
class A {
    static private int x = 10;

    void meth() {
    }

    // Inner class
    private class B {
        static void display() {
            System.out.println("x = " + x);
        }
    }

    public static void main(String[] args) {
        // B ob = new B(); cannot exist without A(Outer class)
        // A ob1 = new A();
        // ob1.display(); // cannot be called
        A outer = new A();
        B inner = outer.new B();
        inner.display();

        B inner1 = new A().new B();
        inner1.display();
        A.B.display();

    }

}
