package testFour_2;

public class SalariedEmployee extends Employee {
    private int base = 6000;
    private int salary;

    public SalariedEmployee(String name, int month){
        super(name,month);
    }

    @Override
    void print(){
        System.out.println( "基本工--"+"姓名:"+this.getName()+" "+"生日所在月："+this.getMonth()+" "+ "所的薪酬："+getSalary(month));
    }
}
