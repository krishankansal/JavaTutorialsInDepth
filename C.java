// selection sort
public class C {
    public static void main(String[] args) {
        int x[] = { 2, 5, 1, 7, 3, 9, 0, -5, -2, 6, 88, 80, -10 };
        int min;
        int temp;
        for (int out = 0; out < (x.length - 1); out++) {
            min = out;
            for (int inner = out + 1; inner < x.length; inner++) {
                if (x[inner] < x[min]) {
                    min = inner;
                }
            }
            temp = x[min];
            x[min] = x[out];
            x[out] = temp;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
