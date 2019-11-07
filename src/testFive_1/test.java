package testFive_1;

public class test {
    public static void main(String[] args) {
        String s1 = "You are a student!";
        String s2 = "How are you!";
        String s3 = "You are a student!";
        String s4 = "You";
        String s5 = "dent!";
        String s6 = "I like java, I'm a coder!";
        String s7 = "10012";
        String s8 = "a";
        char [] str = {'C','o','d','e','r','!'};
        Judge.judgeSame(s1,s2);
        Judge.judgeSame(s1,s3);
        Judge.judgeStart(s1,s4);
        Judge.judgeEnd(s1,s5);

        Compare.compareStr(s1,s2);

        Search.searchStr_first(s1,s8);
        Search.searchStr_last(s1,s8);

        Exchange.exchangeInt(s7);
        Exchange.exchangeArray(s1);
        Exchange.exchangeStr(str);
    }


}
