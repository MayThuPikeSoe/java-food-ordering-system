/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system.controllers;

import com.jfoenix.controls.JFXButton;
import food.ordering.system.Food;
import food.ordering.system.dao.FoodDAO;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class FoodController implements Initializable {

    @FXML
    private TableView<Food> foodTable;
    @FXML
    private TableColumn<Food, Integer> idCol;
    @FXML
    private TableColumn<Food, String> nameCol;
    @FXML
    private TableColumn<Food, String> priceCol;
private FoodDAO foodDAO;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        foodDAO=new FoodDAO();
       initColumn();
       loadTableData();
    }    

    private void initColumn() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
          nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
            priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
    }

    private void loadTableData() {
        
        try {
        List<Food> foodList = foodDAO.getFoods();
         foodTable.getItems().setAll(foodList);
        } catch (SQLException ex) {
            Logger.getLogger(FoodController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

    
    }
    
    

