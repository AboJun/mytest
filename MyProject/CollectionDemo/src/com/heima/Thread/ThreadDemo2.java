package com.heima.Thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread2 mt2 = new MyThread2();

        Thread t = new Thread(mt2);
        t.setName("Abo");
        t.start();
    }
}
