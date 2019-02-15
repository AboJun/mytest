package com.heima.Inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SentDemo {
    public static void main(String[] args) throws IOException{
        DatagramSocket ds = new DatagramSocket();
        String s = "hello world,java";
        byte[] bys = s.getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("192.168.65.88");
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);

        ds.send(dp);

        ds.close();
    }
}
