package secondlab.tasksecond;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Volume: " + triangle.getVolume());

        Shape square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Volume: " + square.getVolume());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Volume: " + rectangle.getVolume());

        Shape cube = new Cube(6);
        System.out.println("Cube Area: " + cube.getArea());
        System.out.println("Cube Volume: " + cube.getVolume());

        Shape circle = new Circle(3);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Volume: " + circle.getVolume());

        Shape sphere = new Sphere(10);
        System.out.println("Sphere Area: " + sphere.getArea());
        System.out.println("Sphere Volume: " + sphere.getVolume());

        Shape pyramid = new Pyramid(5, 7, 6);
        System.out.println("Pyramid Area: " + pyramid.getArea());
        System.out.println("Pyramid Volume: " + pyramid.getVolume());
    }
}
