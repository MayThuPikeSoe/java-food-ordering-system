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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class AdminController implements Initializable {

    @FXML
    private JFXTextField nameField;
    @FXML
    private JFXPasswordField passwordField;
    @FXML
    private JFXButton loginBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void loadCustomerRegistrationView(ActionEvent event) throws IOException {
       
    }

   
        

    @FXML
    private void loadLoginView(ActionEvent event) throws IOException {
         String username=nameField.getText();
        String password=passwordField.getText();
        if(username.isEmpty() || password.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill out all fields.");
            alert.setTitle(null);
            alert.show();
            return;
        }
        if(username.equals("admin") && password.equals("admin")){
        
Parent root = FXMLLoader.load(getClass().getResource("/food/ordering/system/views/login.fxml"));

                    Scene scene=new Scene(root);
                    Stage stage =new Stage();
                    stage.setScene(scene);
                    Stage currentStage=(Stage) loginBtn.getScene().getWindow();
                    currentStage.close();
                    stage.show();
    }
         else{
         Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("name or password incorrect");
            alert.show();  
    }
    }

   

    }
    


    
  

