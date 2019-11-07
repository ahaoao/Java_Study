package OnlineClass.pc_14_javaBean;

import java.util.Objects;

public class Student {
    //成员变量
    private int id;
    private String name;
    private int score;
    //构造方法
    public Student() {
    }
    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    //成员方法


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    //用来将对象转换成其对应的字符串形式
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
    //自定义重写equals
    /*public boolean equals(Object obj){
        /*
        * this：谁调用，就表示谁
        *
        Student s2 = (Student)obj;//向下转型
        return this.id == s2.id;
    }*/

    @Override
    public boolean equals(Object o) {
        //比较两个对象的地址值是否相同
        if (this == o) return true;
        //判断要比较的两个对象是否是同一个类型的对象，提高程序的健壮性
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                score == student.score &&
                //String中的equals
                name.equals(student.name);
    }

}
