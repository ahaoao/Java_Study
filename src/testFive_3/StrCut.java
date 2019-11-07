package testFive_3;

public class StrCut {
    public static void strCut (String s,int n){
        int i=0;
        while(i<s.length()-4){
            System.out.println(s.substring(i,i+=n));
        }
        System.out.println(s.substring(i,s.length()));

    }
}
