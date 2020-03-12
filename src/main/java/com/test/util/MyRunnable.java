package com.test.util;

public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("线程任务");
    }


    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }

}
