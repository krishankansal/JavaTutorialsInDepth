class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        // Instantiate a new instance of the Gen class with Integer type
        Gen<Integer> intGen = new Gen<>(88);

        // Invoke the showType method on the intGen instance
        intGen.showType();

        // Get the value of the intGen instance and assign it to an int variable
        int intVal = intGen.getob();

        // Print out the int value
        System.out.println("Value: " + intVal);

        // Instantiate a new instance of the Gen class with String type
        Gen<String> strGen = new Gen<>("Generic Test");

        // Invoke the showType method on the strGen instance
        strGen.showType();

        // Get the value of the strGen instance and assign it to a String variable
        String strVal = strGen.getob();

        // Print out the String value
        System.out.println("Value: " + strVal);
    }

}
