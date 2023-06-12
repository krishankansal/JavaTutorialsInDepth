public class B {

    final static String collegeName = "Massachusetts";

    public static void main(String[] args) {
        System.out.println(collegeName);
        System.out.println(B.collegeName);
        B ob = new B();
        // ob.collegeName = "Standford";
    }
}
