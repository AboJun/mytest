package com.heima.day06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("java");
        c.add("android");

        //通过迭代器Iterator遍历集合
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //通过toArray()遍历集合
        Object[] o = c.toArray();
        for(Object ob : o){
            System.out.println(ob);
        }


    }
}
