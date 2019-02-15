package com.heima.DiGuiDemo;

import java.io.File;
import java.util.ListIterator;

public class DiGuiDemo {
    public static void main(String[] args) {
        File file = new File("D:\\JavaEE");
        listAll(file,0);
    }

    public static void listAll(File dir, int level) {
        System.out.println(getSpace(level) + dir.getName());

        level++;
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                listAll(files[i], level);
            } else {
                System.out.println(getSpace(level) + files[i].getName());
            }
        }
    }

    public static String getSpace(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append("|--");
        for (int x = 0; x < level; x++){
            sb.insert(0,"|  ");
        }
        return sb.toString();
    }

}
