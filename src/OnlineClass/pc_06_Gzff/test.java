package OnlineClass.pc_06_Gzff;

public class test {
    public static void main(String[] args) {
        /*
        * 构造方法的调用:
        * 子类所有构造方法的第一行都有一个默认的super方法用来访问父类的无参构造方法
        * 如果父类没有无参构造方法，可以通过super(参数)的形式访问父类的带参构造方法
        *
        * 子类不能继承父类中的构造方法。
        * */
        Worker w=new Worker();
    }
}
