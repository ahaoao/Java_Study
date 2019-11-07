package testFour_2;

public class HourlyEmployee extends Employee {
    private int WorkHour;
    private int baseHour=80;
    private int salary;
    public HourlyEmployee(String name, int month,int WorkHour) {
        super(name, month);
        this.WorkHour=WorkHour;
    }

    public int getWorkHour() {
        return WorkHour;
    }

    public void setWorkHour(int workHour) {
        WorkHour = workHour;
    }

    @Override
    public int getSalary(int month) {
        int s = this.getMonth();
        if(WorkHour<160){
            if(flag==s)
                salary=baseHour*WorkHour+100;
            else
                salary=baseHour*WorkHour;
        }
        else{
            if(flag==s)
                salary = (int) (baseHour*160 + (WorkHour-160)*1.5*baseHour+100);
            else
                salary = (int) (baseHour*160+(WorkHour-160)*1.5*baseHour);
        }
        return salary;
    }

    @Override
    void print(){
            System.out.println( "小时工--"+"姓名:"+this.getName()+" "+"生日所在月："+this.getMonth()+" "+ "所的薪酬："+getSalary(month));
        }

}
