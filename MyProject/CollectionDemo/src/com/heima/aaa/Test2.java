package com.heima.aaa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
    public static void main(String[] args) {
        Connection con = JdbcUtil.getConnection("day03");
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT e.ename 员工姓名, e.salary 工资,j.jname 职务名称,j.description 职务描述," +
                    "d.dname 部门名称,d.loc 部门位置,s.grade 工资等级\n" +
                    "FROM emp e INNER JOIN job j ON e.job_id = j.id\n" +
                    "INNER JOIN dept d ON e.dept_id = d.id\n" +
                    "INNER JOIN salarygrade s ON e.salary BETWEEN s.losalary AND s.hisalary;");
                System.out.println("员工姓名\t工资\t职务名称\t职务描述\t\t部门名称\t部门位置\t工资等级");
            while (rs.next()) {
                String name = rs.getString(1);
                double salary = rs.getDouble(2);
                String jname = rs.getString("职务名称");
                String description = rs.getString("职务描述");
                String dname = rs.getString("部门名称");
                String loc = rs.getString("部门位置");
                String grade = rs.getString("工资等级");
                System.out.println(name+"\t\t"+salary+"\t"+jname+"\t\t"+description+"\t"+dname+"\t\t"+loc+"\t\t"+grade);
            }
            JdbcUtil.close(con, stm, rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
