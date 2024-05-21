/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class controller implements Initializable {

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
    private void loadDessertsVieiw(ActionEvent event) {
    }

    @FXML
    private void loadJuiceView(ActionEvent event) {
    }

    @FXML
    private void loadChickenWindow(ActionEvent event) {
    }

    @FXML
    private void loadFrenchfriesWindow(ActionEvent event) {
    }
    
}
