package OnlineClass.pc_09_abstract_Employee;

public class Coder extends Employee {
    //在实际开发过程中，子类一般都有两个构造方法。
    //子类的空参构造访问父类的空参构造
    //子类的全参构造访问父类的全参构造
    public Coder(){
    }

    public Coder(String name,int salary, String id){
        super(name,salary,id);
    }
    @Override
    public void work() {
        System.out.println("职位：Coder"+" "+"工作：没日没夜的敲代码");
        System.out.println("姓名："+getName()+" "+"id："+getId()+" "+"工资："+getSalary());
    }
}
