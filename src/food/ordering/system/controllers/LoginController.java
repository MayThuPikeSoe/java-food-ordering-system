/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system.controllers;

import com.jfoenix.controls.JFXButton;
import food.ordering.system.Food;
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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class LoginController implements Initializable {

    @FXML
    private BorderPane borderPane;
    @FXML
    private JFXButton addBtn;
    @FXML
    private JFXButton logoutBtn;
    @FXML
    private JFXButton viewBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadAddItemsView(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("/food/ordering/system/views/additems.fxml"));
         borderPane.setBottom(root);
        
    }

    @FXML
    private void loadLogoutView(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("/food/ordering/system/views/main.fxml"));
         Scene scene = new Scene(root);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void loadViewBookingWindow(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("/food/ordering/system/views/viewbooking.fxml"));
        Scene scene=new Scene(root);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }

 
    
}
