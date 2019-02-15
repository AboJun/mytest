package com.heima.IODemo;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader("d:\\b.txt"));
            bw = new BufferedWriter(new FileWriter("D:\\10.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
