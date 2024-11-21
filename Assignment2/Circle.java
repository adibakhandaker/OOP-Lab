
public class Circle extends Shape2D {
    int radius;

    public Circle(int l, int w, int radius) {
        super(l, w);
        this.radius = radius;
    }

    double Area() {
        return super.Area();
    }
    double Perimeter() {
        return super.Perimeter();
    }
    void Display()
    {
        System.out.println("Circle :");
//        super.Display();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }
}
