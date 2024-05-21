/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class MainController implements Initializable {

    private JFXButton loginBtn;
   
    private JFXPasswordField passwordField;
    @FXML
    private BorderPane borderPane;
    private JFXTextField nameField;
    @FXML
    private JFXButton adminBtn;
    @FXML
    private JFXButton customerBtn;
    private JFXTextField emailField;
    private JFXTextField addressField;
    private JFXTextField mobileField;
    private JFXTextField usernameField;
    private JFXPasswordField customerpasswordField;
    @FXML
    private JFXButton menuBtn;
    @FXML
    private JFXButton caushierBtn;
    @FXML
    private JFXButton homeBtn;
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
 
    
//    private void loadAddItemsView(ActionEvent event) throws IOException {
//         Parent root =   FXMLLoader.load(getClass().getResource("/food/ordering/system/additems.fxml"));
//      borderPane.setBottom(root);
//    }

    @FXML
    private void loadAdminView(ActionEvent event) throws IOException {
          Parent root =   FXMLLoader.load(getClass().getResource("/food/ordering/system/views/admin.fxml"));
      borderPane.setBottom(root);
    }

    @FXML
    private void loadCustomerWindowView(ActionEvent event) throws IOException {
        Parent root =   FXMLLoader.load(getClass().getResource("/food/ordering/system/views/customer.fxml"));
          borderPane.setBottom(root);
      }
  

    @FXML
    private void loadCaushierloginView(ActionEvent event) throws IOException {
         Parent root =   FXMLLoader.load(getClass().getResource("/food/ordering/system/views/cashier.fxml"));
   borderPane.setBottom(root);
    }

    @FXML
    private void loadHomeView(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("/food/ordering/system/views/main.fxml"));
         Scene scene = new Scene(root);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void loadMenuView(ActionEvent event) throws IOException {
          
   
 Parent root=FXMLLoader.load(getClass().getResource("/food/ordering/system/views/menu.fxml"));
   borderPane.setBottom(root);
      }
    }

   

       
    

 
      
    
    

    

