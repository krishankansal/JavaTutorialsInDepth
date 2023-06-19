public class E {
    int x;
    int y;

    E(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        String s = "x = " + x + ", y = " + y;
        return s;
    }

    public static void main(String[] args) {
        // E a = new E(10, 20);
        // System.out.println(a);
        // // System.out.println(a.hashCode());
        // E b = new E(100, 200);
        // System.out.println(b);
        // // System.out.println(b.hashCode());

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }
}
