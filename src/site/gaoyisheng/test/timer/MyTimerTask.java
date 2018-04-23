package site.gaoyisheng.test.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask{

    private String name;

    public MyTimerTask(String s){
        name = s;
    }

    @Override
    public void run() {
        //Format:
        //YY-MM-DD hh:mm:ss
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");

        System.out.println("Current time is " + simpleDateFormat.format(calendar.getTime()));
        System.out.println("Current task name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
