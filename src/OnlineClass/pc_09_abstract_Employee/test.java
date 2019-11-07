package OnlineClass.pc_09_abstract_Employee;

public class test {
    public static void main(String[] args) {
        Manager manager = new Manager("ahao",6000,"项目部01",2500);
        Coder coder = new Coder("Tom",4500,"开发部25");
        manager.work();
        System.out.println("");
        coder.work();
    }
}
