public class Rectangle extends Shape2D {
    int length;
    int width;

    Rectangle(int l, int w) {
        super(l, w);
        length = l;
        width = w;
    }
    @Override
    double Area() {
        return super.Area();
    }
    double Perimeter() {
        return super.Perimeter();
    }
    double Diagonal() {
        double diagonal= Math.sqrt(Math.pow((length), 2) + Math.pow((width), 2));
        return diagonal;
    }
    void Display()
    {
        System.out.println("Rectangle :");
//        super.Display();
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("Diagonal: " + Diagonal());
    }
}
