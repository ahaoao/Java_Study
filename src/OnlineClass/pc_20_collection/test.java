package OnlineClass.pc_20_collection;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        //1.创建集合对象
        List list = new ArrayList();
        //2.创建元素对象
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔峰",41);
        Student s3 = new Student("虚竹",38);
        Student s4 = new Student("ahao",21);
        //3.将元素对象添加到集合对象中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(list);
        System.out.println("----------------");
        //获取索引为3的元素
        Object obj = list.get(3);
        System.out.println("索引为3的元素为："+obj);
        System.out.println("----------------");
        //获取集合中的元素个数
        System.out.println(list.size());
        System.out.println("----------------");
        //4.遍历集合
        for(int i=0;i<list.size();i++){
            Object obj1 = list.get(i);
            System.out.println(obj1);
        }

    }
}
