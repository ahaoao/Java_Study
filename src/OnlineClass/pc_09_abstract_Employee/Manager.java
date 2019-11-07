package OnlineClass.pc_09_abstract_Employee;

public class Manager extends Employee {
    private int bonus;
    public Manager(){
    }

    public Manager(String name,int salary,String id,int bonus){
        super(name,salary,id);
        this.bonus=bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public void work() {
        System.out.println("职位：Manger"+" "+"工作：喝茶翘着二郎腿看Coder敲代码");
        System.out.println("姓名："+getName()+" "+"id："+getId()+" "+"工资："+(getSalary()+getBonus()));
    }
}
