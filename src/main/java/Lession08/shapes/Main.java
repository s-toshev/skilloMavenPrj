package Lession08.shapes;

public class Main {

    public static void main(String[] args) {
        Circle s1 = new Circle();
        System.out.println("S1 area is:");
        System.out.println(s1.getArea(3.0));
        System.out.println("S1 perimeter is:");
        System.out.println(s1.getPerimeter(3.6));
        System.out.println();

        Shape s2 = new Circle(); // Upcast Circle to Shape
        System.out.println("S2 area is:");
        System.out.println(s2.getArea(3.0));
        System.out.println("S2 perimeter is:");
        System.out.println(s2.getPerimeter(5.0));
        System.out.println();

        Circle s3 = new Circle(); // Downcast back to Circle
        System.out.println("S3 area is:");
        System.out.println(s3.getArea(3.5));
        System.out.println("S3 perimeter is:");
        System.out.println(s3.getPerimeter(3.7));
        System.out.println();
//        Square s4 = new Shape();

        Square s5 = new Square();
        System.out.println("S5 area is:");
        System.out.println(s5.getArea(6.1));
        System.out.println("S5 perimeter is:");
        System.out.println(s5.getPerimeter(6.0));
    }
}