package com.heima.day06;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("js");
        list.add("css");
        list.add("java");

        System.out.println(list);
        ListIterator lit = list.listIterator();
        while(lit.hasNext()){
            String s = (String)lit.next();
            if(s.equals("java")){
                lit.add("android");          //lit写成list,出现并发修改错误
            }
        }
        System.out.println(list);
    }
}
