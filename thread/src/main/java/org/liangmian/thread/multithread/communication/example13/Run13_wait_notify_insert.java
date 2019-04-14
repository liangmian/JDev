package org.liangmian.thread.multithread.communication.example13;

/**
 * Created by Brian on 2016/4/14.
 */

/**
 * P177
 *
 * 等待/通知，交叉执行
 */
public class Run13_wait_notify_insert {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }
}

/*
输出：
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
☆☆☆☆☆
 */
