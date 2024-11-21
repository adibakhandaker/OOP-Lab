public class Cuboid extends Shape3D {
    int height;

    public Cuboid(int l, int w, int h) {
        super(l, w, h);
    }
    public double volume()
    {
        return super.Volume();
    }
    public double surfaceArea()
    {
        return super.surfaceArea();
    }
    void Display()
    {
        System.out.println("Cuboid :");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + volume());
        System.out.println("Surface Area: " + surfaceArea());
    }
}
