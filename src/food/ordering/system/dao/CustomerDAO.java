/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system.dao;

import food.ordering.system.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class CustomerDAO {
     public int saveCustomer(Customer customer) throws SQLException{
        Connection conn=Database.getInstance().getConnection();
        String sql="insert into smdb.customer (name,mobile,address) value (?,?,?)";
        PreparedStatement stmt=conn.prepareStatement(sql);
        stmt.setString(1,customer.getName());
        stmt.setString(2,customer.getMobile());
        stmt.setString(3,customer.getAddress());
        int rows=stmt.executeUpdate();
        return rows;
    }
    public Customer getCustomer(int id) throws SQLException{
          
      Connection conn=Database.getInstance().getConnection();
      String sql="select * from where id=?";
      PreparedStatement stmt=conn.prepareStatement(sql);
      stmt.setInt(1, id);
       ResultSet results=stmt.executeQuery(sql); 
      Customer customer=null;
     if(results.next()){
         
         String name=results.getString("name");
         String mobile=results.getString("mobile");
          String address=results.getString("address");
          
          customer=new Customer(id,name,mobile,address);
        
  } 
     return customer;
  }

  public List<Customer> getCustomers() throws SQLException{
      Connection conn=Database.getInstance().getConnection();
      String sql="select * from customer";
      Statement stmt=conn.createStatement();
      ResultSet results=stmt.executeQuery(sql);
      List<Customer> customerList=new ArrayList<>();
      while(results.next()){
         int id=results.getInt("id");
         String name=results.getString("name");
          String mobile=results.getString("mobile");
          String address=results.getString("address");
         Customer customer=new Customer(id,name,mobile,address);
         customerList.add(customer);
         
      }
      return customerList;
      
  }
    } 

