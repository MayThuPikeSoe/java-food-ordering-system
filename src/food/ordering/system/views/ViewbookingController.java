/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system.views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class ViewbookingController implements Initializable {

    @FXML
    private Button addBtn;
    @FXML
    private TableColumn<?, ?> idCol;
    @FXML
    private TableColumn<?, ?> nameCol;
    @FXML
    private TableColumn<?, ?> foodnameCol;
    @FXML
    private TableColumn<?, ?> foodnumberCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadAddbookingWindow(ActionEvent event) throws IOException {
         Parent root =FXMLLoader.load(getClass().getResource("/food/ordering/system/addbooking.fxml"));
       Scene scene=new Scene(root);
       Stage stage=new Stage();
       stage.setScene(scene);
       stage.show();
    }
    
}
