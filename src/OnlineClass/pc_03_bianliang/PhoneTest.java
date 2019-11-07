package OnlineClass.pc_03_bianliang;

public class PhoneTest {
    /*
        手机类饿测试类
    * */
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.name="ahao";
        phone.call(phone.name);
    }
}
