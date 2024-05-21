/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system.controllers;

import com.jfoenix.controls.JFXTextField;
import food.ordering.system.Food;
import food.ordering.system.dao.FoodDAO;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class AdditemsController implements Initializable {

    @FXML
    private JFXTextField priceField;
    @FXML
    private JFXTextField nameField;
    @FXML
    private Button submitBtn;
private FoodDAO foodDAO;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        foodDAO=new FoodDAO();
    }    

   
       
       

    @FXML
    private void loadFoodTableView(ActionEvent event) throws IOException {
         String name=nameField.getText();
        String price=priceField.getText();
        
        
         Food food=new Food(name,price);
        try {
            foodDAO.saveFood(food);
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("sucessfully save");
            alert.show();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdditemsController.class.getName()).log(Level.SEVERE, null, ex);
        }
         Parent root = FXMLLoader.load(getClass().getResource("/food/ordering/system/views/food.fxml"));
         Scene scene=new Scene(root);
         Stage stage =new Stage();
         stage.setScene(scene);
         stage.show();
    }
    }
    
    

