public class Rectangle implements Figure{

    private  double sideA;
    private  double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        double perimeter=2*(sideA+sideB);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area= sideA*sideB;
        return area;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
