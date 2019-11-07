package OnlineClass.Pc_04_ClassDetails;

//方法重写
public class pc_01_Override {
    public static class Employee{
        String name;
        int salary;
        public String getDetails(){
            return "Name: " + name + "\n" + "Salary: " + salary;
        }
    }
    public static class Manager extends Employee{
        String department;
        public String getDetails(){
            return "Name: " + name + "\n" + "Manager of " + department;
        }
    }
    public static void main(String[] arge){
        Manager manager = new Manager();
        manager.department = "manager1";
        manager.name = "ahao";
        System.out.println(manager.getDetails());
    }
}
