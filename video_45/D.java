public class D extends Object {

    int x;
    int y;

    // 3.
    D() {
        this(1, 2);
        System.out.println("Class D no parameter const. called");
    }

    // 4.
    D(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        System.out.println("D two parameter contructor called");
    }
}
