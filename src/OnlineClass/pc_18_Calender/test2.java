package OnlineClass.pc_18_Calender;

import java.time.Month;
import java.util.Calendar;

public class test2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("---------------------");
        //获取年月日的信息
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);//java中使用0-11表示月份，对应1-12月
        int day = c.get(Calendar.DATE);
        System.out.println(year+"年"+(month+1)+"月"+day+"日");
        System.out.println("---------------------");
        //设置指定时间
        c.set(Calendar.YEAR,2022);
        int year2 = c.get(Calendar.YEAR);
        System.out.println(year2+"年"+(month+1)+"月"+day+"日");
        System.out.println("---------------------");
        c.set(2020,1,2);
        int year3 = c.get(Calendar.YEAR);
        int month3 = c.get(Calendar.MONTH);//java中使用0-11表示月份，对应1-12月
        int day3 = c.get(Calendar.DATE);
        System.out.println(year3+"年"+(month3+1)+"月"+day3+"日");
    }
}
