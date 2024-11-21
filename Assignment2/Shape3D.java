public class Shape3D extends Shape2D{
    int height;

    Shape3D(int l, int w,int h) {
        super(l, w);
        height = h;
    }

    public Shape3D(int l, int w) {
        super(l,w);
    }

    public double Volume(){
        return super.Area();
    }
    public double surfaceArea(){
        double Sarea=2*((length*width)+(width*height)+(height*length));
        return Sarea;
    }

    @Override
    void Display() {
        System.out.println("Shape 3d :");
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
        System.out.println("Surface Area: "+surfaceArea());
    }
}