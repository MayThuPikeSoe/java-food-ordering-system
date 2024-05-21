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
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class BillController implements Initializable {

    @FXML
    private BorderPane borderPane;
    @FXML
    private JFXButton biillBtn;
    @FXML
    private JFXButton logoutBtn;
    @FXML
    private JFXButton cashierBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadBillView(ActionEvent event) throws IOException {
      Parent root =   FXMLLoader.load(getClass().getResource("/food/ordering/system/billtable.fxml"));
   borderPane.setBottom(root);   
    }

    @FXML
    private void loadLogoutView(ActionEvent event) {
    }
    
}
