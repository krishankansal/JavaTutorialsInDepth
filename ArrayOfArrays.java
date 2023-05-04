import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayOfArrays {
    public static void main(String[] args) {
        int x[][] = { { 2, 3, 4, 5 }, { 8, 7, 4, 6 }, { 0, 4, 2, 7 } };
        for (int i = 0; i < x[0].length; i++) {
            System.out.print(x[2][i] + " ");
        }

    }
}
