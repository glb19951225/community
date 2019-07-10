package com.nowcoder.community;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTests {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/community?characterEncoding=utf-8&useSSL=false&serverTimezone=Hongkong";
        String user = "root";
        String pwd = "20190704";

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, pwd);
        System.out.println(conn);
        conn.close();
    }

}
