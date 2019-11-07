package OnlineClass.pc_23_Generic;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    /**
     * 泛型：
     *      泛指任意类型，又叫参数类型化，对具体类型的使用起到辅助作用，类似于方法的参数
     *
     *      集合类泛型：
     *              表示该集合中存放着指定类型的元素
     * 好处：
     *      类型安全
     *      避免了类型转换
     * 总结：
     *      泛型一般只和结合类相使用
     *      泛型是JDK5的新特性，但是从jdk7开始，后边的泛型可以不用写具体的数据类型（菱形泛型）
     * */
    public static void main(String[] args) {
        //1.创建集合对象
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        //list.add(10);  会报错，泛型指定的是String
        System.out.println("没有操作前，集合中的数据是："+list);

        Integer max = Collections.max(list);
        System.out.println("集合中的最大元素为："+max);
        Integer min = Collections.min(list);
        System.out.println("集合中的最小元素为："+min);
        //对集合中的数据进行降序排列：先对集合中的数据进行 升序排列 然后进行 反转
        //升序排列
        Collections.sort(list);
        System.out.println("升序排列后集合为："+list);
        //反转集合
        Collections.reverse(list);
        System.out.println("反转后的集合为："+list);

        //随机置换---相当于洗牌
        Collections.shuffle(list);
        System.out.println("随机置换后的集合为："+list);

    }
}
