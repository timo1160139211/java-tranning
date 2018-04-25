package site.gaoyisheng.test.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeUtil {

    private Calendar calendar = Calendar.getInstance();
    private SimpleDateFormat simpleDateFormat; //= new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");

    public TimeUtil(){
        simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
    }

    public TimeUtil(String format){
        simpleDateFormat = new SimpleDateFormat(format);
    }

    public String getCurrentTime(){
        return simpleDateFormat.format(calendar.getTime());
    }

    /*****   getter   ******/
    public Calendar getCalendar() {
        return calendar;
    }

    public SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }
}
