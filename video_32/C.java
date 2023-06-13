public class C {
    int x = 10;
    int y = 20;

    C() {

    }

    static int z = 30;

    // class method
    static void sort() {
        // System.out.println(z);
        // mean();
        System.out.println("Sort method called");
    }

    static void mean() {
        System.out.println("Mean called");
    }

    static void median() {
        System.out.println("Median called");
    }

    // Instance method
    void meth() {
        int a = this.x + this.y;
        mean();
        System.out.println(z);

        System.out.println("Meth called");
    }

    public static void main(String[] args) {
        // C.sort();
        C ob = new C();
        ob.meth();
    }
}
