package testFour_1;

public class Triangle extends Shape {
    public double a,b,c;
    public Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void judge(){
        if((a+b)>c&&(a+c)>b&&(b+c)>a)
            System.out.println("a,b,c能构成三角形");
        else
            System.out.println("a,b,c不能构成三角形");
    }
    @Override
    public double area(){
        double p = perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public double perimeter(){
        return a+b+c;
    }
}
