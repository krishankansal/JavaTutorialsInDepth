package gen;

import art.Figure;

public class Circle extends Figure {

    public static void main(String[] args) {

        Circle cr = new Circle();
        cr.draw();
        // cr.color(); // -> default methods are available with in the packege only.
        // They are not inherited by the class outside the
        // package.
        cr.resize();

    }

}
