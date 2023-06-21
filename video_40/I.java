class I {
    static int x = 10;

    static class J {
        void show() {

            System.out.println("x = " + x);
        }

        static void hello() {
            System.out.println("hello called");
        }
    }

    public static void main(String args[]) {
        I.J ob = new I.J(); // compare it with non-static inner class
        ob.show();
    }
}