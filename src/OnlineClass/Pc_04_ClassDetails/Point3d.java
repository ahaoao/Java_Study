package OnlineClass.Pc_04_ClassDetails;

public class Point3d extends Point{
    //继承不能是静态
        void print() {
            System.out.println("This is the subclass!");
    }
    public double distance(){
            return Math.sqrt(x*x+y*y+z*z);
    }
}
