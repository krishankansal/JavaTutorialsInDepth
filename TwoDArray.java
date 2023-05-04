class TwoDArray {
    public static void main(String[] args) {
        int x[][] = new int[4][5];
        int k = 100;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                x[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

    }
}

