package testFour_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private int salary;
    protected int month;
    private int base=6000;

    public Employee(String name, int month){
        this.setName(name);
        this.setMonth(month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    GregorianCalendar g = new GregorianCalendar();
    int flag = (int) g.get(Calendar.MONTH)+1;

    public int getSalary(int month) {
        int s = this.getMonth();
        if (flag == s) {
            salary = base + 100;
        }
        else
            salary = base;
        return salary;
    }

    void print(){
        System.out.println("当前月份为："+flag);
    }
}
