package HomeWork_04_Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arithmetic {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        //运算符在字符串中索引的集合
        List<Integer> index = new ArrayList<>();
        //数的集合
        List<Integer> number = new ArrayList<>();
        //运算符的集合
        List<Character> symbol = new ArrayList<>();
        //存储数字和运算符的队列
        Deque deque = new LinkedList();
        //正则匹配出运算符
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);
        String result = m.replaceAll("");
        //初始化运算符和优先级
        Map<String,Integer> map = new HashMap<>();
        map.put("+",1);
        map.put("-",1);
        map.put("*",2);
        map.put("/",2);


        //设置从字符串的索引0开始截取数字
        index.add(0);

        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            symbol.add(ch);
            int Num = str.indexOf(ch);
            index.add(Num);
        }
        System.out.println("符号列表：" + symbol);

        for(int i=0;i<index.size()-1;i++){
            int startIndex = index.get(i);
            int endIndex;
            if(i==index.size()){
                endIndex = index.get(i);
            }
            else{
                endIndex = index.get(i+1);
            }
            int num;
            if(i==index.size()){
                num = Integer.valueOf(str.substring(index.get(i-1),endIndex));
            }
            else if(i==0){
                num = Integer.valueOf(str.substring(startIndex,endIndex));
            }
            else{
                num = Integer.valueOf(str.substring(startIndex+1,endIndex));
            }
            number.add(num);
        }
        System.out.println("数字列表：" + number);
        //按顺序存放所有运算公式元素
        for(int i=0;i<number.size();i++){
            deque.add(number.get(i));
            deque.add(symbol.get(i));
        }
        System.out.println("所有运算公式元素队列："+ deque);


        //开始运算
    }
}
