package com.heima.LambdaDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //eat(()-> System.out.println("吃东西"));

        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("猪小明",20);
        Student s2 = new Student("王自健",28);
        list.add(s1);
        list.add(s2);

        /*ArrayList<Integer> arr = new ArrayList<>();
        arr.add(15);
        arr.add(12);
        arr.add(11);
        arr.add(14);*/
        //System.out.println(arr);

        //arr.forEach(obj -> System.out.println("Lambda遍历集合:"+obj));

       Iterator<Student> it = list.iterator();
        /**while(it.hasNext()){
            int temp = it.next();
            System.out.println("Iterator遍历集合:"+temp);
        }*/

        it.forEachRemaining(stu -> System.out.println("Lambda遍历Iterator:"+stu));
        list.removeIf(student -> student.getName().equals("猪小明"));
        list.forEach(student -> System.out.println(student));
    }
    public static void eat(Eatable e ){
        e.eat();

    }
}
interface Eatable{void eat();}