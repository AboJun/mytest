package com.heima.aaa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        String[] str = getUP();
        login(str);

    }
    public static void login(String[] str){
        Connection con = JdbcUtil.getConnection("mysql");
        Statement stm = null;
        ResultSet rs = null;
        System.out.println(str[0]+"  "+ str[1]);
        try {
            stm = con.createStatement();
            String sql = "SELECT * from user WHERE user = '" + str[0] + "'";// and password = '" + str[1] + "'";
            System.out.println(sql);
            rs = stm.executeQuery(sql);
            boolean next = rs.next();
            System.out.println(next);
            if(rs.next()){
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(con,stm, rs);
        }
    }
    public static String[] getUP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = sc.nextLine();
        System.out.println("请输入密码:");
        String psw = sc.nextLine();
        String[] str = new String[2];
        str[0] = name;
        str[1] = psw;
        return str;
    }
}
