// for finding smallest value in array
public class B {
    public static void main(String[] args) {
        int x[] = { -12, 45, 13, 7, -4, 1, -10 };
        int min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        System.out.println("Minimum value in array = " + min);
    }

}
