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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class CustomerController implements Initializable {

    @FXML
    private JFXTextField nameField;
    @FXML
    private JFXPasswordField passwordField;
    @FXML
    private JFXButton loginBtn;
    @FXML
    private JFXButton registrationBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

//    private void loadCustomerView(ActionEvent event) throws IOException {
//          Parent root = FXMLLoader.load(getClass().getResource("/food/ordering/system/customer.fxml"));
//        Scene scene=new Scene(root);
//                    Stage stage =new Stage();
//                    stage.setScene(scene);
//                     stage.show();
       
    

    @FXML
    private void loadRegistrationView(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("/food/ordering/system/views/registration.fxml"));
 Scene scene=new Scene(root);
 Stage stage =new Stage();
                    stage.setScene(scene);
                      stage.show();
     
    }

    @FXML
    private void loadLoginView(ActionEvent event) {
                      
        String name=nameField.getText();
        String password=passwordField.getText();
       
       // if(name.equals() && password.equals( customerpassword)){
            Alert alert =new Alert(AlertType.INFORMATION);
            alert.setContentText("Success Login");
            alert.show();
    }
    }

   
    

    
