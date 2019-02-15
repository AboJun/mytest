package com.heima.Reflectdemo;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        String name = "com.heima.Inet.SentDemo";
        Class clazz = Class.forName(name);
        Class claz = String.class;
        System.out.println(clazz);
    }
}
