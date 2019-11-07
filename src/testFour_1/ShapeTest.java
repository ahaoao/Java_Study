package testFour_1;

public class ShapeTest {
    public static <circle> void main(String[] arge){
        Shape[] shapes={
                new Rectangle(10,5),
                new Circle(5),
                new Triangle(3,4,5),
                new Square(4)
        };
        for(int i=0; i<shapes.length;i++){
            double length = shapes[i].perimeter();
            double area = shapes[i].area();
            if(shapes[i] instanceof Circle){
                System.out.println("Shape("+(i+1)+"):"+"length:"+ String.format("%.4f",length) + ",area"+String.format("%.4f",area));
            }
            else{
                System.out.println("Shape("+(i+1)+"):"+"length:"+length+",area:"+area);
                if(shapes[i] instanceof Rectangle){
                    Rectangle r = (Rectangle) shapes[i];
                    System.out.println("长宽差是： "+r.differ());
                }
            }
        }
    }
}
