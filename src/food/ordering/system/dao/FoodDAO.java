/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system.dao;

import food.ordering.system.Food;
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
public class FoodDAO {
    public int saveFood(Food food) throws SQLException{
        Connection conn=Database.getInstance().getConnection();
        String sql="insert into smdb.food (name,price) values (?,?)";
        PreparedStatement stmt=conn.prepareStatement(sql);
        stmt.setString(1, food.getName());
        stmt.setString(2,food.getPrice());
        
        int rows=stmt.executeUpdate();
        return rows;
    }
     public List<Food> getFoods() throws SQLException{
        Connection conn = Database.getInstance().getConnection();
        String sql = "select * from smdb.food";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        List<Food> foods = new ArrayList<>();
        while(result.next()){
           int id = result.getInt("id");
           String name = result.getString("name");
           String price = result.getString("price");
           
           Food food = new Food(id, name, price);
           foods.add(food);
        }
        return foods;
    }
}
