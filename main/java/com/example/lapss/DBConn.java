package com.example.lapss;

//import com.almasb.fxgl.net.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DBConn {
    public Connection connection;

    public  DBConn(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/lapdatabase","root","");
            System.out.println("conneted");
        } catch (SQLException e) {
            connection = null;
            System.out.println(e);
        }
    }





}

