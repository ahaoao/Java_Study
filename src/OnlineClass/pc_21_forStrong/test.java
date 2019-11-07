package OnlineClass.pc_21_forStrong;

import java.util.ArrayList;
import java.util.List;

public class test {
    /**
     * 增强for格式：
     * for(元素的数据类型 变量名 : 要遍历的数组或者集合对象){
     *     //循环体，变量也就是元素
     * }
     * 快捷方式：
     * iter --> 回车
     *注意：
     *      增强for的底层依赖的是迭代器(Iterator)
     *      （增强for就是迭代器的简写形式）
     * */
    public static void main(String[] args) {

        //1.创建集合对象
        List list = new ArrayList();
        //2.创建元素对象

        //3.将元素对象添加到集合对象
        list.add(10);//参数为Object类型
        list.add(30);
        list.add(50);
        list.add(40);
        list.add(20);

        //4.遍历集合
        for (Object obj:list){
            //obj 是集合中的元素，起本身应该是Integer类型的数据
            Integer ii = (Integer)obj;
            System.out.println(obj);
        }
    }
}
