package com.heima.IODemo;

import java.io.*;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("aaa/bb.txt");
        char[] chs = new char[1024];
        int len;
        //while ((len = fr.read(chs)) != -1){
           // System.out.println(new String(chs));
        //}
        System.out.println("-----------------");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        fr.close();

    }
}
