package org.liangmian.thread.multithread.timer.example3;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by brian on 2016/4/15.
 */
public class TaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("B run timer=" + new Date());
    }
}
