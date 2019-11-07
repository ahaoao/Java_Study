package OnlineClass.pc_03_bianliang;

public class Student {
    private String name;
    private int age;
    /*
    * 构造方法：
    * 方法名必须与类名相同
    * 没有返回值
    * 没有返回值类型
    *
    * 构造方法可以重载
    * */
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }
}
