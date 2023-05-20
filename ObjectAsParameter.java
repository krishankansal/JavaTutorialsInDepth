class ObjectAsParameter {
    // Two instance variables or two instance properties
    int a, b;

    // Construstor for class ObjectAsParameter
    ObjectAsParameter(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Instance method
    boolean equalTo(ObjectAsParameter passedObject) {
        if (this.a == passedObject.a && this.b == passedObject.b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ObjectAsParameter ob1 = new ObjectAsParameter(100, 200);
        ObjectAsParameter ob2 = new ObjectAsParameter(100, 200);
        ObjectAsParameter ob3 = new ObjectAsParameter(10, 34);
        System.out.println("ob1 == ob2 : " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3 : " + ob1.equalTo(ob3));
    }

}