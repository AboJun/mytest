package com.heima.IODemo;

import javax.annotation.processing.Filer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWRDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        char[] chs = new char[1024];
        int len;

        try {
            fr = new FileReader("D:\\a.txt");
            fw = new FileWriter("D:\\c.txt");
            while((len = fr.read(chs)) != -1){
                fw.write(chs,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fr != null && fw != null){
                try {
                    fr.close();
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
