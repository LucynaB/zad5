public class Triangle {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculatePerimeter(){
        ShapeCalculator sc = new ShapeCalculator();
        return sc.trianglePerimeter(this);

    }
}
