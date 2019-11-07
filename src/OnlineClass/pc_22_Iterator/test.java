package OnlineClass.pc_22_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class test {
    /**
     * 迭代器：
     * 概述：对过程的重复称为迭代。迭代器是遍历Collection集合的通用方式
     *
     * 迭代器的常用方法
     *      E next():  返回迭代的下一个对象
     *      boolean hasNext(): 如果仍有元素可以迭代，则返回true
     *
     *      注意：
     *      列表迭代器是List体系独有的遍历方式，可以在对象集合遍历的同时进行添加、删除等操作。
     *      但是必须通过调用列表迭代器的方法来实现。
     *
     *      使用步骤
     *      1.根据集合对象获取其对象的迭代器对象
     *      2.判断迭代器中是否有元素
     *      3.如果有就直接获取
     *
     *      */
    public static void main(String[] args) {

        //1.创建集合对象
        List list = new ArrayList();
        //2.创建元素对象
        //3.将元素对象添加到集合对象
        list.add("a");
        list.add("b");
        list.add("c");
        //迭代器的使用
        //1.根据集合对象获取其对象的迭代器对象
        ListIterator it = list.listIterator();
        //2.判断迭代器中是否有元素
        /*while (it.hasNext()){//如果迭代器中有元素，就一直迭代
            String s = (String) it.next();
            System.out.println(s);
        }*/
        System.out.println("---------------------");


        //判断集合中有没有字符串"b"，就在后面
        while(it.hasNext()){
            String s = (String)it.next();
            if("b".equals(s)){//这样写可以避免空指针异常
                //list.add("java");//除列表迭代器以外。这样写不行，会报错 ConcurrentModificationException（并发修改异常）
                it.add("java");//列表迭代器可以在迭代的同时添加，删除数据
            }
            System.out.println(s);
        }
        System.out.println(list);

    }
}
