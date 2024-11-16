public class Abstract {
    public static void main(String[] args) {
        // Circle
        Circle circle = new Circle(7.0, "Red", true);
        System.out.println(circle.toString());
        System.out.println("Area     : " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Rectangle
        Rectangle rectangle = new Rectangle(6.0, 8.0, "Yellow", false);
        System.out.println(rectangle.toString());
        System.out.println("Area     : " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Square
        Square square = new Square(4.0, "Blue", true);
        System.out.println(square.toString());
        System.out.println("Area     : " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}