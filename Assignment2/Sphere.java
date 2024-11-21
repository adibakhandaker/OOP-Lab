public class Sphere extends Shape3D{
    int height;

    public Sphere(int l, int w,int h) {
        super(l,w,h);
    }
    public double volume()
    {
        return super.Volume();
    }
    public double surfaceArea()
    {
        return super.surfaceArea();
    }

    @Override
    void Display() {
        System.out.println("Sphere :");
        System.out.println("Length :"+length);
        System.out.println("Width :"+width);
        System.out.println("Height :"+height);
        System.out.println("Surface Area :"+surfaceArea());
    }
}
