/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251.project;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author leo0x
 */
public class database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        int id;
        double g;
        String name;
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cpit-251?autoReconnect=true&useSSL=false", "root", "");
        Statement stat = con.createStatement();
//users table
        // stat.execute("create table if not exists users(username CHAR(30) PRIMARY KEY,pass char(20) NOT NULL )");
//orders table      
        //stat.execute("create table if not exists orders(user char(30) references users(username),ordernumber int ,numofsinglebeef int DEFAULT 0,numberofdoublebeef int DEFAULT 0 ,numOfchicken int DEFAULT 0,Numofdulxe int DEFAULT 0,total double )");
        //stat.execute("drop table orders");

        stat.close();
        con.close();
    }

    public static int Mutli(int a, int b) {

        return a * b;
    }

}
