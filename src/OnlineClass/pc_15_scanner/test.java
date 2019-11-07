package OnlineClass.pc_15_scanner;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //创建scanner类型的对象（要导包）
        //System.in ：标准输入流，默认指向键盘
        Scanner sc = new Scanner(System.in);
/*
        System.out.println("请输入一个整数: ");
        if(sc.hasNextInt()){
            int num = sc.nextInt();
        System.out.println("num: " +num);
        }
        else
            System.out.println("请正确输入！");*/
        System.out.println("请录入一个字符串");
        String str1 = sc.nextLine();//结束标记：换行符
        System.out.println("str1: "+str1);

        String str2 = sc.next(); //结束标志符：空格，tab，回车
    }
}
