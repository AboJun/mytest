package com.heima.aaa;

import java.sql.*;

public class JdbcUtil {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String database){
        try {
            return DriverManager.getConnection("jdbc:mysql:///"+database,"root" , "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Connection con, Statement stm , ResultSet rs) {
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stm != null){
            try {
                stm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection con, Statement stm){
        close(con,stm ,null );
    }
}
