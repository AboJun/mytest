package com.heima.IODemo;

import java.io.*;

public class ReadKey {
    public static void main(String[] args) throws IOException{
        readKey();
    }

    public static void readKey() throws IOException{
        StringBuilder sb = new StringBuilder();

        InputStream in = System.in;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
//        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("D:\\new.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\new.txt"));
        /*int ch = 0;
        while ((ch = in.read()) != -1){
            if(ch == '\r'){
                continue;
            }
            if(ch == '\n'){
                String temp = sb.toString();
                if("over".equals(temp)){
                    break;
                }
                //System.out.println(temp.toUpperCase());
                System.out.println(temp);
                bw.write(temp);
                bw.newLine();
                bw.flush();
                sb.delete(0,sb.length());

            }else {
                sb.append((char)ch);
            }
        }*/

        String line;
        while((line = br.readLine())!= null){
            if ("over".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
            System.out.println(line);
        }
    }
}
