// Returning an object.
class ReturningObject {
    int a;

    ReturningObject(int i) {
        a = i;
    }

    ReturningObject incrByTen() {
        ReturningObject temp = new ReturningObject(this.a + 10);
        return temp;
    }

    public static void main(String args[]) {
        ReturningObject ob1 = new ReturningObject(2);
        ReturningObject ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);
    }
}


