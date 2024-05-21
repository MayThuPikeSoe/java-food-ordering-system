/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system.controllers;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;


import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 
    @FXML
    private JFXButton dessertsBtn;
    @FXML
    private JFXButton juiceBtn;
    @FXML
    private JFXButton chickenBtn;
    @FXML
    private JFXButton frenchfriesBtn;
Dell
 */
public class MenuController implements Initializable {

    @FXML
    private JFXButton dessertsBtn;
    @FXML
    private JFXButton juiceBtn;
    @FXML
    private JFXButton chickenBtn;
    @FXML
    private JFXButton frenchfriesBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadDessertsVieiw(ActionEvent event) throws IOException {
         Parent root =   FXMLLoader.load(getClass().getResource("/food/ordering/system/views/dessert.fxml"));
  Scene scene=new Scene(root);
  Stage stage =new Stage();
  stage.setScene(scene);
    stage.show();
    }

    @FXML
    private void loadJuiceView(ActionEvent event) throws IOException {
         Parent root =   FXMLLoader.load(getClass().getResource("/food/ordering/system/views/juice.fxml"));
  Scene scene=new Scene(root);
  Stage stage =new Stage();
  stage.setScene(scene);
    stage.show();
    }

    @FXML
    private void loadChickenWindow(ActionEvent event) {
    }

    @FXML
    private void loadFrenchfriesWindow(ActionEvent event) {
    }
    
}
