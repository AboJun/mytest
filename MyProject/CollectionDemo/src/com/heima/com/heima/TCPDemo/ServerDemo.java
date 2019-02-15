package com.heima.com.heima.TCPDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(8081);                   //服务器端socket
        Socket s = ss.accept();                                         //监听

        InputStream fis = s.getInputStream();                             //输入流

        byte[] bys = new byte[1024];                                       //获取数据
        int len = fis.read(bys);
        String str = new String(bys,0,len);
        System.out.println(str);

        String str2 = str.toUpperCase();

        OutputStream os = s.getOutputStream();

        os.write(str2.getBytes());

        s.close();


    }
}
