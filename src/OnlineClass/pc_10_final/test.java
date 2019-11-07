package OnlineClass.pc_10_final;

public class test {
    /**
     * final关键字:
     * 可以用来修饰类，成员变量，成员方法
     * 修饰的类：不能被继承，但是它可以继承其他类
     * 修饰的方法：不能重写
     * 修饰的变量：是一个常量，值只能设置一次
     * */
    public static void main(String[] args) {
        Employee em= new Coder();
        em.show();

        //final修饰的变量：基本类型的变量，是值不能改变
        final int num = 20;
            //num=30; 代码会报错，常量值只能设置一次
        System.out.println(num);

        //final修饰的变量：引用类型的变量，是地址值不能改变，但是属性值可以发生改变
        final Employee em2 = new Employee();
            //em2=new Employee();代码报错，因为new会开辟新空间，地址值会发生改变
        em2.name="ahao";
        em2.age=21;
        System.out.println("name属性："+ em2.name);
        System.out.println("age属性："+em2.age);
        System.out.println("");
        //属性值可以改变
        em2.name="ao";
        em2.age=23;
        System.out.println("name属性："+ em2.name);
        System.out.println("age属性："+em2.age);

    }
}
