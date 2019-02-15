package com.heima.com.heima.TCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("192.168.65.26",8081);
        OutputStream os = s.getOutputStream();
        os.write("I'm coming".getBytes());

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String str = new String(bys,0,len);
        System.out.println(str);

        s.close();
    }
}
