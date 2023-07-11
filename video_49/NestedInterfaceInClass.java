class OuterClass {

    interface InnerInterface {
        void innerMethod();
    }
}

class ImplementingClass implements OuterClass.InnerInterface {
    public void innerMethod() {
        System.out.println("This is InnerInterface method");
    }
}

public class NestedInterfaceInClass {

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();

        obj.innerMethod();
    }

}