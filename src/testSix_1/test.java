package testSix_1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个日期的年份：");
        int year1 = sc.nextInt();
        System.out.println("请输入第一个日期的月份：");
        int month1 = sc.nextInt();
        System.out.println("请输入第一个日期的日期：");
        int day1 = sc.nextInt();

        System.out.println("请输入第二个日期的年份：");
        int year2 = sc.nextInt();
        System.out.println("请输入第二个日期的月份：");
        int month2 = sc.nextInt();
        System.out.println("请输入第二个日期的日期：");
        int day2 = sc.nextInt();

        //1.计算毫秒值
        long time1 = DateExample.gainTime(year1,month1,day1);
        long time2 = DateExample.gainTime(year2,month2,day2);
        //2.比较日期大小
        DateExample.compareDate(time1,time2);
        //3.间隔天数
        DateExample.differTime(time1,time2);
    }
}
