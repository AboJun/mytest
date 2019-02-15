package com.heima.Thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("A");
        mt.start();

        MyThread mt2 = new MyThread();
        mt2.setName("B");
        mt2.start();
    }
}
