package com.heima.Inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.65.88");

        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println(hostName);
        System.out.println(hostAddress);
    }
}
