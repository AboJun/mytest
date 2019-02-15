package com.heima.IODemo;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        fr = new FileReader("d:\\a.txt");
        LineNumberReader lr = new LineNumberReader(fr);

        String s = null;
        lr.setLineNumber(100);
        while ((s = lr.readLine()) != null) {
            System.out.println(lr.getLineNumber()+":"+s);
        }
        lr.close();
    }
}
