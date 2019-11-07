package HomeWork_04_Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Test {
    public static void DealString(String s, Queue<String> dequeNum, Queue<Character> dequeSymbol){
        //nums数组存放所有需要计算的数字或变量
        String[] nums = s.split("[+*-/=]");
        //把要计算的数字存放到队列中
        for(int i=0;i<nums.length;i++){
            dequeNum.offer(nums[i]);
        }
        //symbols存放所有运算符
        String symbols="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='='){
                symbols+=s.charAt(i);
            }
        }
        //把运算符存放到队列里
        for(int i=0;i<symbols.length();i++){
            dequeSymbol.offer(symbols.charAt(i));
        }
    }

    public static void Calculate(Queue<String> dequeNum,Deque<Character> dequeSymbol,Stack<String> num,Stack<Character> sym){
        //当符号队列不空的时候
        while(!dequeSymbol.isEmpty()){
            int num1=0;
            int num2=0;
            if(sym.isEmpty()){//存放运算符的栈为空
                if(num.isEmpty()){//存放数的栈为空
                    num.push(dequeNum.poll());//数字出队并进栈
                }
                sym.push(dequeSymbol.poll());//运算符出队进栈
                num.push(dequeNum.poll());
            }else{

                char SymPeek=sym.peek();//查看运算符栈栈顶，不删除栈顶
                char Q2Peek=dequeSymbol.peek();//查看队列队首，不删除队首


                switch(SymPeek){
                    case('+'):{
                        if(Q2Peek=='+'|Q2Peek=='-'|Q2Peek=='='){
                            sym.pop();
                            int result=0;
                            num1=Integer.parseInt(num.pop());
                            num2=Integer.parseInt(num.pop());
                            result=num1+num2;
                            num.push(result+"");

                        }else{
                            num.push(dequeNum.poll());
                            sym.push(dequeSymbol.poll());
                        }
                        break;
                    }
                    case('-'):{
                        if(Q2Peek=='+'|Q2Peek=='-'|Q2Peek=='='){
                            sym.pop();
                            int result=0;
                            num1=Integer.parseInt(num.pop());
                            num2=Integer.parseInt(num.pop());
                            result=num2-num1;
                            num.push(result+"");

                        }else{
                            num.push(dequeNum.poll());
                            sym.push(dequeSymbol.poll());
                        }
                        break;
                    }
                    case('*'):{
                        sym.pop();
                        int result=0;
                        num1=Integer.parseInt(num.pop());
                        num2=Integer.parseInt(num.pop());
                        result=num1*num2;
                        num.push(result+"");

                        break;
                    }
                    case('/'):{
                        sym.pop();
                        int result=0;
                        num1=Integer.parseInt(num.pop());
                        num2=Integer.parseInt(num.pop());
                        result=num2/num1;
                        num.push(result+"");
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Stack<String> num=new Stack<>();//存放变量的栈
        Stack<Character> sym =new Stack<>();//存放运算符的栈
        Deque<String> dequeNum = new LinkedList<>();//存放变量的队列
        Deque<Character> dequeSymbol = new LinkedList<>();//存放运算符的队列

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //处理字符串
        DealString(s,dequeNum,dequeSymbol);
        //开始计算
        Calculate(dequeNum,dequeSymbol,num,sym);
        //输出结果
        while(!num.isEmpty()){
            num.pop();//栈非空时，栈顶指针指向栈顶的下一个位置
            System.out.println("计算结果是： "+num.pop());
        }
    }
}