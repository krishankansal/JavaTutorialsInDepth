public class F {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.hashCode());
        s = "abcde";
        System.out.println(s.hashCode());
        s = "xyz";
        System.out.println(s.hashCode());

        double d = 234.567;
        String x = String.valueOf(d);
        System.out.println(x);
    }

}
