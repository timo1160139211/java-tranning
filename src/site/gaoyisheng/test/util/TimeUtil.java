package site.gaoyisheng.test.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeUtil {

    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat simpleDateFormat; //= new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");

    public String getTime(){
        simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
        return simpleDateFormat.format(calendar.getTime());
    }

    public TimeUtil(String format){
        simpleDateFormat = new SimpleDateFormat(format);
    }
}
