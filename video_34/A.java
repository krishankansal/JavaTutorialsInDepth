public class A {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        } else {
            System.out.println("Please provide two arguments");
        }
    }
}
