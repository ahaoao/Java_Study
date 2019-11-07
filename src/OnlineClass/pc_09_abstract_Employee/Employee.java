package OnlineClass.pc_09_abstract_Employee;

public abstract class Employee {
    private String name;
    private int salary;
    private String id;

    public Employee(){

    }

    public Employee(String name, int salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getId() {
        return id;
    }

    public abstract void work();
}
