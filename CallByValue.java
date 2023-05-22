// Simple Types are passed by value.
class CallByValue {
    
    void meth(int a, int b) {
        a *= 2;
        b /= 2;
    }

    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }

}