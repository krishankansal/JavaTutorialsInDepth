public interface F {

    void sum();

}

interface G extends F{

    void subtract();


}

class Calc implements G{

    @Override
    public void sum() {
       
    }

    @Override
    public void subtract() {
       
    }
    
}
