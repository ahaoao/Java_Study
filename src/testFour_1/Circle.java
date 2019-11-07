package testFour_1;

public class Circle extends Shape {
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    @Override
    public double area() {
        return radius*radius*3.14;
    }

    @Override
    public double perimeter() {
        return radius*2*3.14;
    }
}
