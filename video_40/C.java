public class C {
   // instance method of the outer class 
   void meth() {
      int x = 20;

      // method-local inner class
      class D {
         public void print() {
            System.out.println("This is method inner class "+x);	   
         }   
      } // end of inner class
	   
      // Accessing the inner class
      D inner = new D();
      inner.print();
   }
   
   public static void main(String args[]) {
      C outer = new C();
      outer.meth();	   	   
   }
}