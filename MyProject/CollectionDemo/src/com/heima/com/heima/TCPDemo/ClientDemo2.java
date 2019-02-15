package com.heima.com.heima.TCPDemo;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientDemo2 {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("192.168.1.10",8885);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入账号:");
        String name = br.readLine();
        System.out.println("请输入密码:");
        String psw = br.readLine();


        //PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        //pw.println(name);
        //pw.println(psw);

        bw.write(name);
        bw.newLine();
        bw.flush();//漏掉这行
        bw.write(psw);
        bw.newLine();
        bw.flush();//漏掉
        s.shutdownOutput();//漏掉
        BufferedReader serBR = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str = serBR.readLine();
        System.out.println(str);

        s.close();


    }
}
