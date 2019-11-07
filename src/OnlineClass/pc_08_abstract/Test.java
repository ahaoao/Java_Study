package OnlineClass.pc_08_abstract;

/**
 * 抽象类的特点：
 * 1.抽象类和抽象方法必须用abstract关键字修饰
 * 2.抽象方法不能实例化
 *     通过创建其子类对象来完成初始化操作
 * 3.抽象类的子类：
 * 如果是普通类，必须重写所有的抽象方法
 * 如果是抽象类，则不用重写抽象方法
 *
 * 抽象类成员的特点：
 * 1.可以有普通的成员变量，也可以有成员常量
 * 2.可以有抽象方法，也可以有非抽象方法
 * 3.有构造方法，并且构造方法还可以重载
 *
 * 抽象类中的成员比普通类中多一种：抽象方法
 * 其他和普通类一样
 * */

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom");
        cat.eat();
        cat.sleep();

        cat.name="jerry";
        System.out.println(cat.name);
        System.out.println(cat.AGE);
    }
}
