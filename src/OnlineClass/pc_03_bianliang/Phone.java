package OnlineClass.pc_03_bianliang;

public class Phone {
    //成员变量：定义在类中，方法之外
    String brand;
    String model;
    String name;
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}
