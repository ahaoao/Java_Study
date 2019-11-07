package testFive_1;

public class Compare {
    //按字典顺序比较两个字符串的大小
    public static void compareStr(String s1, String s2){
        if(s1.compareTo(s2) == 0)
            System.out.println(s1 + "=" + s2);
        //S1按字典顺序排列在s2之前，结果为负整数
        if(s1.compareTo(s2) < 0)
            System.out.println(s1+"<"+s2);
        //S1按字典顺序排列在s2之后，结果为负整数
        if(s1.compareTo(s2) > 0)
            System.out.println(s1+">"+s2);
    }
}
