package OnlineClass.pc_12_interface1;

public class Mouse implements USB,A,B {//多实现
    @Override
    public void open() {
        System.out.println("连接鼠标");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标");

    }
}
