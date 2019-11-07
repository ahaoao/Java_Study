package OnlineClass.pc_12_interface;

public class test {
    /**
     * 接口：就是提供的统一规则，规范
     * 定义格式：
     * interface 接口名 { }
     * 类和接口之间是实现关系，用关键字implements来表示
     * class 类名 implements 接口名 { }
     * 接口中 只有成员常量，没有成员变量。没有构造方法。
     * */
    public static void main(String[] args) {
        Smoking sm = new Teacher();
        sm.smoke();
    }

}
