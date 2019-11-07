package OnlineClass.pc_14_javaBean;

import javax.xml.namespace.QName;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student(1, "欧阳修", 66);
        //输出语句直接打印对象，默认调用了该对象的toString()方法
        System.out.println(s1);

        //测试equals()
        //在实际开发中，把两个对象的各个属性值都相同的情况下，才会认为是同一个对象
        Student s2 = new Student(1,"欧阳修",66);
        boolean b1 = s1.equals(s2);
        System.out.println(b1);
    }
}
