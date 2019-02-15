package com.heima.demo斗地主;

import com.heima.com.heima.TCPDemo.User;
import com.heima.com.heima.TCPDemo.UserDB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class ServerAll {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8883);
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String name = br.readLine();
        String psw = br.readLine();
        System.out.println(name + ":"+psw);

        Poker p = new Poker();
        p.creatPoker();
        p.faPoker(p.getList());
        p.naDizhupai();
        String pok1 = p.showPoker("play1",p.getPlay1());
        String pok2 = p.showPoker("play2",p.getPlay2());
        String pok3 = p.showPoker("play3",p.getPlay3());
        String dipai = p.showPoker("dipai",p.getDipai());

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println(pok1);
        s.close();
    }
}
