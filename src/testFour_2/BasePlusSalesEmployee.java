package testFour_2;

public class BasePlusSalesEmployee extends SalariedEmployee {
    private int sales;
    private int base = 3000;
    private double baseBonus=0.2;
    private int salary;

    public BasePlusSalesEmployee(String name, int month, int sales) {
        super(name, month);
        this.sales=sales;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getSalary(int month){
        int s= this.getMonth();
        if(flag == s)
            salary=(int)(base+sales*baseBonus+100);
        else
            salary=(int)(base+sales*baseBonus);
        return salary;
    }
    @Override
    public void print(){
        System.out.println( "基本销售额工--"+"姓名:"+this.getName()+" "+"生日所在月："+this.getMonth()+" "+ "所的薪酬："+getSalary(month));
    }
}
