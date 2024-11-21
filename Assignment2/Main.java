import java.awt.geom.Rectangle2D;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape2D s2 = new Shape2D(4, 5);
        s2.Display();
        System.out.println(" ");

        Rectangle r = new Rectangle(1, 2);
        r.Display();
        System.out.println(" ");

        Circle c = new Circle(6, 7, 8);
        c.Display();
        System.out.println(" ");

        Triangle t = new Triangle(9, 10, 11, 12);
        t.Display();
        System.out.println(" ");

        Shape3D s3 = new Shape3D(13, 14, 15);
        s3.Display();
        System.out.println(" ");

        Sphere s = new Sphere(16, 17, 18);
        s.Display();
        System.out.println(" ");

        Cuboid cu = new Cuboid(19, 20, 21);
        cu.Display();
        System.out.println(" ");

    }
}