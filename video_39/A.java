class A{

    static private int x = 10;

    class B{

        static void display(){
            System.out.println("x = " + x);
        }
    }

    public static void main(String[] args) {
        //B ob = new B(); -> B instance cannot exist without A
        //A outer = new A();
        // outer.display(); - > cannot be called
        A outer = new A();
        B inner = outer.new B();
        inner.display();

        B inner1 = new A().new B();
        inner1.display();

        A.B.display();
    }
}