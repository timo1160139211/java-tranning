package site.gaoyisheng.test.timer;

import java.util.Timer;

public class MyTimer {

    public static void main(String[] args) {
        //1.创建一个Timer实例
        Timer timer = new Timer();

        //2.创建一个MyTimerTask实例
        MyTimerTask myTimerTask = new MyTimerTask("num 1");

        //3.通过timer 定时定频率调用 myTimerTask的业务逻辑

        //  第一次执行是在当前时间的两秒之后，然后每间隔1秒执行一次
        timer.schedule(myTimerTask,2000L,1000L);

    }

}
