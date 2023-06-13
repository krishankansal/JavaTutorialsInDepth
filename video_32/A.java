public class A {

    int x = 20; // instance variable
    static int y = 30; // class variable

    public static void main(String[] args) {        
        // static variables can be called without
        // instantiating the class.
        System.out.println(y);
        System.out.println(A.y);
        // A ob1 = new A();
        // ob1.y = 300;
        // A ob2 = new A();
        // ob2.y = 400;
        // A ob3 = new A();
        // ob3.y = 500;
        // System.out.println(ob1.y);
        // System.out.println(ob2.y);
        // System.out.println(ob3.y);
    }
}
