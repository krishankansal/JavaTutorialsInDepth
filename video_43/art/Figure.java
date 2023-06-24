package art;

// superclass
public class Figure {
    int a = 10;

    public void draw() {
        System.out.println("Figure has been drawn");
    }

    void color() {
        System.out.println("Select from 10 different colors");
    }

    private void render() {
        System.out.println("Rendring the figure");
    }

    protected void resize() {
        System.out.println("Figure has been resized");
    }
}

// class Figure is now superclass, parentclass, baseclass
// class Rectangle is now subclass, child class
class Rectangle extends Figure {

    void area() {
        System.out.println("Area of rectangle");
    }

    void color() {
        System.out.println("Select from 40 different colors");
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.color();
        rec.draw();
        // rec.render(); -> private method are not inherited
        rec.resize();
        rec.area();
    }

}
