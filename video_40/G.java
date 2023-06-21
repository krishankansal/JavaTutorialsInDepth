class G {

    static class H {
        // static class can contain non-static methods
        static void display() {
            System.out.println("Static inner class method called");
        }
    }

    public static void main(String args[]) {
        G.H ob = new G.H(); // compare it with non-static inner class
        // ob.display();
        G.H.display();

    }
}