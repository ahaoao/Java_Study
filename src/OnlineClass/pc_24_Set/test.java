package OnlineClass.pc_24_Set;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class test {
    /**
     * 单列集合--Set集合
     * 特点：无序，唯一
     *
     *      为什么Set集合没有“去重”？
     *          因为Set集合保证元素的唯一性依赖：equals()和HashCode()两个方法
     *          没有再Student中重写这两个方法，默认调用的Object类中的这两个方法
     *          而Object中的equals()方法默认比较的是地址是否相同
     *      解决方案：在Student中重写equals和HashCode
     *
     *      总结：
     *      Set集合保证元素的唯一性：equals和HashCode方法
     * */


    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student s1 = new Student("ahao",21);
        Student s2 = new Student("陈奕迅",45);
        Student s3 = new Student("李李",20);
        Student s4 = new Student("陈奕迅",45);
        Student s5 = new Student("seo",20);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        System.out.println(set);
        System.out.println("-----------------");
        //通过增强for循环遍历
        for(Student st : set){
            System.out.println(st);
        }
        System.out.println("-----------------");
        //通过迭代器遍历Set集合
        Iterator<Student> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
