package OnlineClass.pc_04_override;

public class OverLoadDemo {
    public static void main(String[] arge) {
        /*方法重载的概念：
            同一个类中的多个方法，出现方法名相同，但是参数列表不同的情况，
            参数列表不同：
                参数的个数不同
                参数对应的数据类型不同

             方法重载与方法的返回值类型无关
        * */
        int a=20,b=10;
        boolean k= compare(20,10);
        System.out.println(k);
    }
    public static boolean compare(int a,int b){
        System.out.println("判断两个int类型是否相等");
        return a==b;
    }
    public static boolean compare(char a,char b){
        System.out.println("判断两个char类型是否相等");
        return a==b;
    }
    public static boolean compare(double a,double b){
        System.out.println("判断两个char类型是否相等");
        return a==b;
    }

}