public class Main {
    public static void main(String[] args) {

        Square square = new Square(4);
        double  squareArea = square.calculateArea();
        System.out.println("Pole kwadratu: " + squareArea);

        Circle circle = new Circle(5);
        double  circleArea = circle.calculateArea();
        System.out.println("Pole koła: " + circleArea);

        Triangle triangle = new Triangle(3, 4, 5);
        double trianglePerimeter = triangle.calculatePerimeter();
        System.out.println("Obwód trójkąta: " + trianglePerimeter);

        Rectangle rect = new Rectangle(5,10);
        double  rectPerimeter = rect.calculatePerimeter();
        System.out.println("Obwód prostokąta: " + rectPerimeter);
    }
}
