/**
 * Author: ahao
 * Date:2019.11.5
 * Description: 将学生对象存到ArrayList中，并按照先年龄，再姓名，后学号 进行排序
 * */


package HomeWork_03_Studnet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManage {


    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student(20181041, "Ahao", "男",21,"计科");
        Student stu2 = new Student(20181042,"Jom","男",20,"软工");
        Student stu3 = new Student(20171020,"Jerry","女",22,"数媒");
        Student stu4 = new Student(20162020,"Merry","女",21,"计科");
        Student stu5 = new Student(20181058,"Eason","男",20,"网工");
        Student stu6 = new Student(20181042, "Ahao", "男",21,"计科");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list.add(stu6);

        // 排序
        // 自然排序
        // Collections.sort(list);
        // 比较器排序
        // 如果同时有自然排序和比较器排序，以比较器排序为主
        Collections.sort(list,new StudentCompare());
        for (Student student : list) {
            System.out.println(student);
        }
    }
    /**
     * 构造比较器
     * */
    public static class StudentCompare implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            if( s1.getAge() - (s2.getAge())!=0 ){//年龄排序
                return s1.getAge()-(s2.getAge());
            }else{
                if(s1.getName().compareTo(s2.getName())!=0)//姓名排序
                    return s1.getName().compareTo(s2.getName());
                else
                    return (int)(s1.getId()-(s2.getId()));//学号排序
            }
        }
    }
}
