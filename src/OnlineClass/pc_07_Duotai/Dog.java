package OnlineClass.pc_07_Duotai;

public class Dog extends Animal{
    //需求：重写父类的eat方法
    @Override
    public void eat(){
        System.out.println(getName()+"吃骨头");
    }
}
