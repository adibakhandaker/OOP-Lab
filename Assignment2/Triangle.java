public class Triangle extends Shape2D {
    int base;
    int height;

    Triangle(int l, int w, int b, int h) {
        super(l, w);
        base=super.length;
        height=super.width;
    }

    double Area() {
        return super.Area();
    }
    double Perimeter() {
        return super.Perimeter();
    }
    void Display()
    {
        System.out.println("Triangle :");
//        super.Display();
        System.out.println("base: "+base);
        System.out.println("height: "+height);
        System.out.println("Area: "+Area());
        System.out.println("Perimeter: "+Perimeter());
    }
}
