public class E extends D {
    int z;

    // 1.
    E() {
        this(10);
        System.out.println("E no parameter contructor called");

    }

    // 2.
    E(int z) {
        super();
        System.out.println("class E one parameter constructor called");

    }

    public static void main(String[] args) {
        E ob = new E();
    }
}
