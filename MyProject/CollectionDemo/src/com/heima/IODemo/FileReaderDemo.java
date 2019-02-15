package com.heima.IODemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fr = null;

        char[] chs = new char[1024];
        int len;
        try {
            fr = new FileReader("D:\\a.txt");
            while((len = fr.read(chs)) != -1){
                System.out.println(new String(chs, 0, len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
