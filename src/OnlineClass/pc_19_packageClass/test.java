package OnlineClass.pc_19_packageClass;

public class test {
    public static void main(String[] args) {
        /**
         * 注意：除了Character类以外，其他的7种包装类都有parseXXX()方法
         *因为如果字符串想转换成char类型的数据，可以通过：String类中的方法toCharArray()，charAt()
         */
        int a = 10;
        //装箱：基本类型转换为包装类型
        Integer i1 = new Integer(a);
        //拆箱：包装类型转换为基本类型
        int b = i1.intValue();
        System.out.println("-------------------");
        //jdk5的新特性，自动拆装箱
        Integer i2 = a; //装箱
        int c = i2;//拆箱
        System.out.println(a+" "+i2);
        System.out.println("-------------------");
        String s = "10";
        int num = Integer.parseInt(s);
        System.out.println(num);
        System.out.println(num+100);
    }
}
