package com.heima.Inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SentDemo2 {
    public static void main(String[] args) throws IOException{
        DatagramSocket ds = new DatagramSocket ();
        byte[] bys = "hello,java".getBytes();

        DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("192.168.65.88"),8888);

        ds.send(dp);
        ds.close();
    }
}
