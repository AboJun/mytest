package com.heima.demo斗地主;

import java.io.*;
import java.net.Socket;

public class Play1 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.65.27",8883);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入账号:");
        String name = br.readLine();
        System.out.println("请输入密码:");
        String psw = br.readLine();


        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println(name);
        pw.println(psw);

        BufferedReader serBR = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str = serBR.readLine();
        System.out.println(str);
        //String str2 = serBR.readLine();
        //System.out.println(str2);

        s.close();
    }
}
