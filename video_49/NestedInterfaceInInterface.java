interface OuterInterface {
    void outerMethod();

    interface InnerInterface {
        void innerMethod();
    }
}

class OnlyOuter implements OuterInterface {
    public void outerMethod() {
        System.out.println("This is OuterInterface method");
    }
}

class OnlyInner implements OuterInterface.InnerInterface {
    public void innerMethod() {
        System.out.println("This is InnerInterface method");
    }
}

public class NestedInterfaceInInterface {

    public static void main(String[] args) {
        OnlyOuter obj_1 = new OnlyOuter();
        OnlyInner obj_2 = new OnlyInner();

        obj_1.outerMethod();
        obj_2.innerMethod();
    }

}