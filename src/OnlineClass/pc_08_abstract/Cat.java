package OnlineClass.pc_08_abstract;

public class Cat extends Animal {
    String catName;
    public Cat(String name){
        this.catName=name;
    }
    @Override
    public void eat() {
        System.out.println(catName+"爱吃鱼");
    }

    @Override
    public void sleep() {
    System.out.println(catName+"爱睡觉");
    }
}
