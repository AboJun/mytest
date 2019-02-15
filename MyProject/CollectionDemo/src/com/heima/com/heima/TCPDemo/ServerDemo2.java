package com.heima.com.heima.TCPDemo;

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.List;

public class ServerDemo2 {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(8885);
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String name = br.readLine();
        String psw = br.readLine();
        System.out.println(name + ":"+psw);

        List<User> users = UserDB.getUsers();

        User user = new User(name,psw);

        boolean flag = false;
        /*if("itheima".equals(name) && "123456".equals(psw)){
            flag = true;
        }*/
        if(users.contains(user)){
            flag = true;
        }
       // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        if(flag){
            System.out.println("登录成功");
            pw.println("success");
        }else{
            System.out.println("登录失败");
            pw.println("failure");
        }
        s.close();
    }
}
