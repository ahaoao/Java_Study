package testFive_1;

public class Search {
    public static void searchStr_last(String s1,String s2){
        System.out.println(s2+"在"+s1+"中最后一次出现的位置是： "+s1.lastIndexOf(s2));
    }
    public static void searchStr_first(String s1, String s2){
        System.out.println(s2+"在"+s1+"中第一次出现的位置是： "+s1.indexOf(s2));
    }
}
