import static java.lang.Math.pow;

public class Circle implements Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimeter= 2 * radius * Math.PI;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area= Math.PI* pow(radius,2);
        return area;
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
