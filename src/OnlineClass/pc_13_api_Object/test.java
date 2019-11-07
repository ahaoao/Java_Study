package OnlineClass.pc_13_api_Object;

public class test {
    /**
     * Object类：
     * 概述：
     *      类层次结构最顶层的基类，所有类都直接或者间接的继承自Object类
     * 构造方法：
     *      int hashCode():返回对象的哈希码值
     *      Class<?> getClass():返回调用者的字节码文件对象
     *      String toString():返回该对象的字符串表示形式
     *      boolean equals():比较两个对象是否相等
     *      注意：
     *          java.lang包下的类可以直接使用，不用导包
     **/

    public static void main(String[] args) {
        //非静态方法的调用方式通过 对象名. 的形式调用

        Object obj1 = new Object();
        Object obj2 = new Object();
        //int hashCode():不同对象的哈希码值一般不同
        int code1 = obj1.hashCode();
        int code2 = obj2.hashCode();
        System.out.println(code1);
        System.out.println(code2);
        //Class<?> getClass():返回该调用者的字节码文件对象，一个类只有一个字节码文件对象
        Class class1 = obj1.getClass();
        Class class2 = obj2.getClass();
        System.out.println(class1);
        System.out.println(class2);
        //String toString():默认打印的是地址值，不同对象的地址值不同。
        //  地址值的组成： 全类名 + @ + 该对象的哈希码的十六进制形式组成
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        System.out.println(s1);
        System.out.println(s2);
        //boolean equals():比较两个对象是否相等，默认比较的是地址，无意义，子类一般都会重写这个方法。
        boolean b1 = obj1.equals(obj1);
        System.out.println(b1);
    }

}
