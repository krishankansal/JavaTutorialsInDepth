public class OverloadingTwo {
    void sum(int a, int b) {
        System.out.println("The sum = " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("The sum = " + (a + b + c));
    }

    void sum(int a, int b, int c, int d) {
        System.out.println("The sum = " + (a + b + c + d));
    }

    void sum(int a, int b, int c, int d, int e) {
        System.out.println("The sum = " + (a + b + c + d + e));
    }

    public static void main(String[] args) {
        OverloadingTwo ob = new OverloadingTwo();
        ob.sum(10, 20, 10, 10);
    }

}
