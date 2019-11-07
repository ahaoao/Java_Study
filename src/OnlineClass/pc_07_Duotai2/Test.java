package OnlineClass.pc_07_Duotai2;

public class Test {
    /**
     * 多态关系中成员变量的使用
     * 通过多态的方式创建对象，测试成员变量的使用
     *
     * 结论：多态关系中成员变量不能被重写   “编译看左，运行看左”
     * 编译看左：在编译期间会看左边的类型有没有这个成员变量，没有就报错
     * 运行看左：在运行期间使用的是左边的类型中的这个成员
     * */
    public static void main(String[] args) {
        //多态方法
        Animal an = new Dog();
        System.out.println(an.name);
        //通过普通方式创建对象。
        Dog dog = new Dog();
        System.out.println(dog.name);
    }
}
