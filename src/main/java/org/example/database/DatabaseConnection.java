package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void connect(String path){
        try{
            con = DriverManager.getConnection("jdbc:sqlite:"+path);
            System.out.println("Connected");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void disconnect(){
       try{
           con.close();
           System.out.println("Disconnected");
       }
       catch(SQLException e){
           e.printStackTrace();
       }
    }




}
