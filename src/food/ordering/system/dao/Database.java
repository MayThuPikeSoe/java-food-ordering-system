/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class Database {
     
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String password = "";
    
    
    
    private static Database db;
    private Connection conn;
    
    private Database() throws SQLException{
        connect();
    }
    
    public static Database getInstance() throws SQLException{
        if(db==null){
            db = new Database();
        }
        return db;
    }
      private void connect() throws SQLException{
        conn = DriverManager.getConnection(url, user, password);
    }
       public void createDatabase() throws SQLException{
       
        
        String sql="create database if not exists smdb";
         Statement stmt=conn.createStatement();
        stmt.execute(sql);
    }
     
       public Connection getConnection() {
        return conn;
    }
}
