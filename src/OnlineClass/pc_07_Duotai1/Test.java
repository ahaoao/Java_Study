package OnlineClass.pc_07_Duotai1;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setName("哈士奇");
        Animal mouse = new Mouse();
        mouse.setName("Jerry");
        showAnimal(dog);
        showAnimal(mouse);
    }
    /**
     * 多态的做法。
     * 多态的应用场景：父类型可以作为形参的数据类型。
     * 这样可以接收其任意子类对象。
    */
    public static void showAnimal(Animal a){
        a.eat();
    }
}
