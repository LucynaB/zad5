public class Circle {

    double r;

    Circle(double r){
        this.r = r;
    }

    double calculateArea(){
        ShapeCalculator sc = new ShapeCalculator();
        return sc.circleArea(this);

    }
}
