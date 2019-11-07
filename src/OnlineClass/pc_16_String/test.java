package OnlineClass.pc_16_String;

public class test {
    public static void main(String[] args) {
        /*索引从0开始*/
        String str = "java 程序猿";
        //获取当前字符串的长度
        System.out.println(str.length());
        //获取指定索引位置的字符
        System.out.println(str.charAt(7));
        //获取指定字符(串)第一次出现的索引
        System.out.println(str.indexOf('a'));
        //获取指定字符(串)最后一次出现的索引
        System.out.println(str.lastIndexOf('a'));
        //获取指定位置（含）之后的字符串
        System.out.println(str.substring(3));
        //获取索引start(含)到索引end(不含)的字符串
        System.out.println(str.substring(3,7));
        System.out.println("-------------------");
        String str2 = "abc程序员java";
        //将字符串转换成字节数组
        byte[] bys = str2.getBytes();
        for(int i = 0; i<bys.length;i++){
            System.out.println(bys[i]);
        }
        System.out.println("-------------------");
        //将字符串转换成字符数组
        char[] chs = str2.toCharArray();
        for(int i = 0;i<chs.length;i++){
            System.out.println(chs[i]);
        }
        System.out.println("-------------------");
        //将指定类型数据转换成字符串
        String s2 = String.valueOf(123);
        System.out.println(s2+4);
        //在实际开发过程中，上述方法基本上都会用下面的这行代码替代
        String s3 = ""+ 123;
        System.out.println(s3+4);
        System.out.println("-------------------");
        //将指定字符串替换成新的字符串
        String s1 = "abc abc abc";
        String s5 = s1.replace('b','d');
        System.out.println(s5);
        System.out.println("-------------------");
        //切割字符串，返回切割后的字符串数据，原字符串不变
        String[] arr = s1.split(" ");
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("-------------------");
        //去掉两端的空格
        String s6 = "   a  b  c ";
        String s7 = s6.trim();
        System.out.println(s6);
        System.out.println(s7);
    }
}
