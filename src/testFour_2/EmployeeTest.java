package testFour_2;

public class EmployeeTest{
    public static void main(String[] arge){
        Employee[] employees = {
                new SalariedEmployee("Marry", 10),
                new HourlyEmployee("Jom", 9, 180),
                new SalesEmployee("Aha", 10, 5000),
                new BasePlusSalesEmployee("Moat", 11, 4000)
        };
        for(int i=0;i< employees.length;i++){
            employees[i].print();
        }
    }
}
