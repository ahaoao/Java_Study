package testFive_1;

public class Judge {

    //判断s1是否与s2相同
    public static void judgeSame(String s1, String s2){
        if(s1.equals(s2))
            System.out.println(s1+"与"+s2+"相同");
        else
            System.out.println(s1+"与"+s2+"不同");
    }
    //判断s2是否是s1的前缀
    public static void judgeStart(String s1, String s2){
        if(s1.startsWith(s2))
            System.out.println(s2+"是"+s1+"的前缀");
        else
            System.out.println(s2+"不是"+s1+"的前缀");
    }
    //判断s2是否是s1的后缀
    public static void judgeEnd(String s1, String s2){
        if(s1.endsWith(s2))
            System.out.println(s2+"是"+s1+"的后缀");
        else
            System.out.println(s2+"不是"+s1+"的后缀");
    }

}
