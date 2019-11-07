package OnlineClass.pc_17_StringBuilder;

public class test {
    /**
    * StringBuilder:
     * 可变字符序列，用于构造字符串对象。内部使用自动扩容的数组操作字符串。StringBuilder和StringBuffer使用相同的api
     * StringBuilder(): 构造一个空的StringBuilder容器
     * StringBuilder(String): 构造一个StringBuilder容器，并添加指定字符串
     * StringBuilder append() ： 将任意数据添加到StringBuilder容器中，返回自身
     * String toString():将当前的StringBuilder 容器转换成字符串*/
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("abc");
        System.out.println("sb: "+ sb);
        System.out.println("sb2: "+sb2);
        System.out.println("----------------");
        //将String类型的"abc"转换成StringBuilder类型的对象
        StringBuilder sb3 = new StringBuilder("abc");
        System.out.println("sb3:"+sb3);
        System.out.println("----------------");
        //将三个字符串拼接成一个字符串
        StringBuilder sb4 = new StringBuilder();
        sb4.append("ahao");
        sb4.append("在办公室");
        sb4.append("努力学java");
        System.out.println("sb4: "+sb4);
        System.out.println("----------------");
        String s = sb4.toString();
        System.out.println("字符串："+s);
    }
}
