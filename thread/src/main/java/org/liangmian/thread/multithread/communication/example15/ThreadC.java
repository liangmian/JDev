package org.liangmian.thread.multithread.communication.example15;

/**
 * Created by Brian on 2016/4/14.
 */
public class ThreadC extends Thread {

    private ThreadB b;

    public ThreadC(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        b.bService();
    }
}
