package com.heima.IODemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("aaa");
        if(!file.exists()){
            file.mkdir();
        }
        FileWriter fileWriter = new FileWriter("aaa/bb.txt");

        fileWriter.write("nihao");
        fileWriter.write("你好");
        fileWriter.write("\r\n");
        fileWriter.write("你好");
        fileWriter.write("\r\n");
        fileWriter.write("你好");
        fileWriter.write("\r\n");
        fileWriter.write("你好");
        fileWriter.flush();
        fileWriter.close();

    }
    public static void njk(){

    }
}
