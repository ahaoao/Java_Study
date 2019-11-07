package OnlineClass.pc_05_thisSuper;

public class son extends father{
    int num = 20;
    public void show(){
        int num=10;
        System.out.println(num);//本方法变量
        System.out.println(this.num);//本类变量
        System.out.println(super.num);//父类变量
    }

}
