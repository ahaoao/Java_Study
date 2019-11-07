package testFour_1;

public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double area(){
        return length*width;
    }
    @Override
    public double perimeter(){
        return length*2+width*2;
    }

    public double differ(){
        return Math.abs(length-width); //返回参数的绝对值
    }
}
