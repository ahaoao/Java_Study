package testFour_2;

public class SalesEmployee extends Employee {
    private int sales;
    private double baseBonus=0.2;
    private int salary;

    public SalesEmployee(String name, int month,int sales) {
        super(name, month);
        this.sales=sales;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public int getSalary(int month){
        int s=this.getMonth();
        if(flag==s)
            salary = (int) (sales*baseBonus+100);
        else
            salary= (int) (sales*baseBonus);
        return salary;
    }
    @Override
    void print(){
        System.out.println( "销售额工--"+"姓名:"+this.getName()+" "+"生日所在月："+this.getMonth()+" "+ "所的薪酬："+getSalary(month));
    }
}
