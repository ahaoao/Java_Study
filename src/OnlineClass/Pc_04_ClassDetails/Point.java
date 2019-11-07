package OnlineClass.Pc_04_ClassDetails;

public class Point {
    static int x;
    static int y;
    static int z;
    void print() {
        System.out.println("This is the superclass!");
    }
    Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double distance(){
        return Math.sqrt(x*x + y*y);
    }

    public static void main(String[] arge) {
        Point superp = new Point(3,4);
        superp.print();
        double dis = superp.distance();
        System.out.println(dis);
        Point3d subp = (Point3d) new Point(3,2,1);
        double dis1 = subp.distance();
        System.out.println(dis1);
    }
}


