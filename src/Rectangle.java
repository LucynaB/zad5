public class Rectangle {

    double a;
    double b;

    Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    double calculatePerimeter(){
        ShapeCalculator sc = new ShapeCalculator();
        return sc.rectPerimeter(this);

    }

}
