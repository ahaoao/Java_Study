package OnlineClass.pc_18_Calender;

import java.util.Date;

public class test {
    /**
     * Date:
     * 日期类用于操作时间
     * 构造方法：
     *      Date()：构造一个日期对象，当前系统时间，精确到秒
     *      Date(long)：构造一个日期对象，时间为自“1970年1月1日00:00:00 GMT”起，至指定参数的毫秒数
     *      成员方法long getTime(): 将日期对象转换成对应时间的毫秒值
     * Calender：
     * 日历类，用于操作日期相关信息
     * 成员方法：
     * static Calender getInstance() :根据当前系统时区和语言环境获取日历对象
     * int get(int field): 返回给指定日历字段的值
     * void set(int field, int value):将给定的日历字段设置为指定的值
     * */
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data);
        //获取当前操作系统时间的毫秒值
        long time = data.getTime();
        System.out.println(time);
        //Oct 27 16:15:46 CST 2019 --> 1572164146804
        //创建一个指定的时间
        Date date2 = new Date(1572164146804L);
        System.out.println(date2);
    }
}
