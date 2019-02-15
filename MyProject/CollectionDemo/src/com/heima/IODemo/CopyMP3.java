package com.heima.IODemo;

import java.io.*;
/*
* 拷贝MP3文件
* 使用BufferedInputStream字节流
* */
public class CopyMP3 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        byte[] bys = new byte[1024];
        int len;
        try {
            bis = new BufferedInputStream(new FileInputStream("E:\\music\\11\\八音盒 poppin 曲.mp3"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\poppin.mp3"));

            while((len = bis.read(bys)) != -1){
                bos.write(bys,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
