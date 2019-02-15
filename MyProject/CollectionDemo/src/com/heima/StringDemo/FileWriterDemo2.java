package com.heima.StringDemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
    public static void main(String[] args) {
        String str = "Hello World ...";

        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\b.txt");
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
