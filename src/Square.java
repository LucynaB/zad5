public class Square {

    double a;

    Square(double a){
        this.a = a;
    }

    double calculateArea(){
        ShapeCalculator sc = new ShapeCalculator();
        return sc.squareArea(this);

    }
}
