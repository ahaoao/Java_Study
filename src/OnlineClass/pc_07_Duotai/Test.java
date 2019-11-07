package OnlineClass.pc_07_Duotai;

public class Test {
    /**
     * 演示多态
     * Java中实现多态的三个步骤；
     * 1.要有继承（或者实现）关系
     * 2.要有方法重写
     * 3.要有父类引用指向子类对象
    * */
    public static void main(String[] args) {
        Animal dog = new Dog();
        //结论：多态中调用成员方法是“编译看左”（左边的类型有没有这个成员方法）
        //     “运行看右”（运行时具体用的是右边的该成员）
        dog.setName("dog");
        dog.eat();
    }

}
