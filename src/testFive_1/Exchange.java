package testFive_1;

public class Exchange {
    public static void exchangeInt(String s1){
        //数字型字符串转换为数字
        int i = Integer.valueOf(s1);
        System.out.println(s1+"转换成数字后为："+i);
    }
    public static void exchangeArray(String s1){
        char[] chs = s1.toCharArray();
        for(int i = 0;i<chs.length;i++){
            System.out.print(chs[i]+"  ");
        }
    }
    public static void exchangeStr(char[] arr){
        String str = String.valueOf(arr);
        System.out.println(str);
    }
}

