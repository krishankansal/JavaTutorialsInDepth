// Cretae subclass
public class D extends C {

    int k = 40;
    int j = 300; // variable hiding

    void sum() {
        System.out.println("sum = " + (i + j + k));
    }

}
class Z extends C{
    
}
