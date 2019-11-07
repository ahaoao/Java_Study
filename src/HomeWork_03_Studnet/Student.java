/**
 * Author: ahao
 * Date:2019.11.5
 * Description: 学生对象
 * */
package HomeWork_03_Studnet;

public class Student {
    private long id;
    private String name;
    private String sex;
    private int age;
    private String department;

    public Student() {
    }

    public Student(long id, String name, String sex, int age, String department) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return
                "id:" + id +
                        ", name: " + name  +
                        ", sex: " + sex +
                        ", age: " + age +
                        ", department: " + department;

    }
}
