package OnlineClass.pc_25_Map;
import  OnlineClass.pc_24_Set.Student;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test {
    /**
     * Map集合的特点：
     *      双列集合，元素由键值对构成 ： key -- value
     *      键key不能重复，值value可以重复
     *
     *      应用：
     *          Map<T1,T2> map = new HashMap()
     *      T1表示键的数据类型   T2表示值的数据类型
     *
     *      成员方法：
     *          V put(K key, V value) 添加元素（键值对的形式）
     *                                元素第一次添加，返回null，重复添加会用新值覆盖旧值，并返回旧值
     *          V get(Object key)  根据键获取对应的值
     *          Set<K> keySet()  获取所有键的集合
     * */
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        Student s1 = new Student("徐豪",21);
        Student s2 = new Student("陈奕迅",45);
        Student s3 = new Student("李李",20);
        Student s4 = new Student("陈奕迅",45);
        Student s5 = new Student("seo",20);
        /*Student stu1 = map.put(1,s1);
        System.out.println("Stu1: "+ stu1);
        Student stu2 = map.put(1,s2);
        System.out.println("Stu2: "+stu2 );*/

        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
        map.put(4,s4);
        map.put(5,s5);
        System.out.println(map);
        System.out.println(map.get(3));

        //遍历
        //1.获取所有键的集合
        Set<Integer> keys = map.keySet();

        //2.获取迭代器对象
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            Student value = map.get(key);
            System.out.println(value);
        }

        //通过增强for遍历
        //获取所有的键
        System.out.println("------------------");
        Set<Integer> keys1 = map.keySet();
        for (Integer key : keys1) {
            Student value = map.get(key);
            System.out.println(value);
        }
    }
}
