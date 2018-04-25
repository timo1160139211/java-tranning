package site.gaoyisheng.test.timer;

import site.gaoyisheng.test.util.TimeUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

public class MyTimer {

    public static void main(String[] args) {

        TimeUtil timeUtil = new TimeUtil();

        //1.创建一个Timer实例
        Timer timer = new Timer();

        //2.创建一个MyTimerTask实例
        MyTimerTask myTimerTask = new MyTimerTask("num 1");

        //3.通过timer 定时定频率调用 myTimerTask的业务逻辑

        //  第一次执行是在当前时间的两秒之后，然后每间隔1秒执行一次
        //timer.schedule(myTimerTask,2000L,1000L);

        /*获取当前时间，并设置成据当前时间3s之后的时间
         *如当前时间为 2018-1-1 23:59:57
         *则 设置后的时间为 2018-1-2 00:00:00
         */
        //System.out.println(timeUtil.getCurrentTime());
        //timeUtil.getCalendar().add(Calendar.SECOND,3);

        //---------------schedule的用法 -----------------------
        /*
         * 1.在时间等于或超过time的时候 执行且仅执行一次
         *   如: 在 2018-1-2 00:00:00 执行一次task         *
         */
        //myTimerTask.setName("schedule1");
        //timer.schedule(myTimerTask,timeUtil.getCalendar().getTime());

        /*
         * 2.在时间等于或超过time的时候 首次执行task
         *   之后每隔period毫秒重复执行一次
         *
         *   如: 在 2018-1-2 00:00:00 执行第一次task
         *      之后每隔2秒执行一次task
         */
        myTimerTask.setName("schedule2");
        timer.schedule(myTimerTask
                ,timeUtil.getCalendar().getTime()
                ,2000L);//7*24*60*60*1000L   定时统计或者记录

    }

}
