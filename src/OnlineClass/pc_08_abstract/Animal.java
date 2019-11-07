package OnlineClass.pc_08_abstract;

public abstract class Animal {
    //成员常量：其值可以改变
    String name="哈士奇";
    //成员常量：其值不能改变
    final int AGE=30;

    public abstract void eat();
    public abstract void sleep();

}
