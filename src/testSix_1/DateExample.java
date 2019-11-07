package testSix_1;

import java.util.Calendar;
import java.util.Date;

public class DateExample {
    private int year;
    private int month;
    private int day;
    public static long gainTime(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        Date t = calendar.getTime();
        long time = t.getTime();
        return time;
    }
    public static void compareDate(long time1,long time2){
        Date date1 = new Date(time1);
        Date date2 = new Date(time2);
        if(time1>time2)
            System.out.println(date1 + "在" + date2 + "之后");
        else if(time1<time2)
            System.out.println(date1 + "在" + date2 + "之前");
        else
            System.out.println(date1 + "与" + date2 + "相同");
    }
    public static void differTime(long time1, long time2){
        Date date1 = new Date(time1);
        Date date2 = new Date(time2);
        long differ = Math.abs((time1-time2));
        long days = differ/(1000*60*60*24);
        System.out.println("第一个日期和第二个日期相差："+days+"天");
    }
}
