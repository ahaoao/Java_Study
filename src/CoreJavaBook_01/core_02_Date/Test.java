package CoreJavaBook_01.core_02_Date;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * This problem print date
 * @version 1.5 2019-11-7
 * @author ahao
 * */

public class Test {
    public static void main(String[] args) {
        //构造
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 0; i < value; i++)
            System.out.print("   ");
        while(date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
    }
}
