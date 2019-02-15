package com.heima.aaa;

import java.sql.*;

public class Test {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement stm = null;
        con = DriverManager.getConnection("jdbc:mysql:///day02", "root", "root");
        stm = con.createStatement();
        //boolean b = stm.execute("CREATE table stu (id int PRIMARY KEY ,name VARCHAR (20))");
        //stm.execute("INSERT INTO stu (id,name) VALUES (1,'朱晓明'),(2,'王老六')");
        ResultSet rs = stm.executeQuery("SELECT * from stu");
        // System.out.println(b);
       while (rs.next()){
           int id = rs.getInt("id");
           String name = rs.getString("name");
           System.out.println(id+" "+name);
       }
       rs.close();
       stm.close();
       con.close();

    }
}
