class SelectionSort {
    public static void main(String[] args) {
        // array to be sorted
        int x[] = { 2, 5, -1, 7, -8, 3, 0, 12, -4 };
        int min; // to save the index of smallest element
        int temp; // for swapping
        for (int out = 0; out < (x.length - 1); out++) {
            min = out;// assumed that smallest element is at index min
            for (int inner = out + 1; inner < x.length; inner++) {
                if (x[inner] < x[min]) {
                    min = inner;
                } // end if
            } // inner for loop ends
            temp = x[min];
            x[min] = x[out];
            x[out] = temp;
        } // outer for ends
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}