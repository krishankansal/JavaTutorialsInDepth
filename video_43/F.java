public class F {
    void methf() {
        System.out.println("methf called");
    }
}

class G extends F {
    void methg() {
        System.out.println("methg called");
    }
}

class H extends G {
    void methh() {
        System.out.println("methh called");
    }
}

class I {
    public static void main(String[] args) {
        H ob = new H();
        ob.methf();
        ob.methh();
        ob.methg();
    }
}
