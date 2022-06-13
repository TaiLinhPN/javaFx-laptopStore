package com.example.lapss;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import java.sql.DriverManager;


public class  HandleLaptop {
    public Connection connection;

    public  HandleLaptop(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/lapdatabase","root","");
            System.out.println("conneted");
        } catch (SQLException e) {
            connection = null;
            System.out.println(e);
        }
    }

    List<Laptop> laptops(){
        ArrayList<Laptop> laptop = new ArrayList<>();
        try {
            ResultSet resul = connection.prepareStatement("SELECT * FROM `laptops`").executeQuery();
            while (resul.next()){
                int id = resul.getInt("id");
                String name = resul.getString("name");
                String img = resul.getString("img");
                String compary = resul.getString("company");
                Float price = resul.getFloat("price");
                System.out.println(id);
                System.out.println(name);

                laptop.add(new Laptop(id , price,name,img,compary));
            }


        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return laptop;



    }
}
