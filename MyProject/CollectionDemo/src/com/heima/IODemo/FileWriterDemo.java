package com.heima.IODemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fw = null ;//错误: 未初始化
		
		int[] arr = new int[2795];
		
		for(int i= 0; i < arr.length; i++){
			arr[i] = i;
		}
		int j= 0;
		
        try{
			fw = new FileWriter("D:\\a.txt");
			fw.write("copy /b ");
			fw.flush();
			while(j < arr.length){
            //fw.write("copy /b "+ arr[j]+".ts new.ts\r\n");
			fw.write(arr[j]+".ts ");
			j++;
            fw.flush();
			}
			fw.write("new.ts\r\n");
          
            
        }catch (IOException e){
            System.out.println(e.toString());
        }finally {
            if(fw != null){
                try{
                    fw.close();
                }catch (IOException e){
                    throw new RuntimeException("关闭失败");
                }
            }
        }
    }
}
