/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.ordering.system.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import food.ordering.system.Customer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class RegistrationController implements Initializable {

    @FXML
    private BorderPane borderPane;
    
    @FXML
    private JFXTextField addressField;
    @FXML
    private JFXTextField mobileField;
    private JFXPasswordField customerpasswordField;
    @FXML
    private JFXButton adminBtn;
    @FXML
    private JFXButton submitBtn;
    @FXML
    private JFXTextField idField;
//private CustomerDAO customerDAO;
    @FXML
    private JFXTextField nameField;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      //   customerDAO=new CustomerDAO();
    }    

   

    


    @FXML
    private void loadCustomerRegistrationView(ActionEvent event) throws IOException {
           Parent root =   FXMLLoader.load(getClass().getResource("/food/ordering/system/views/customername.fxml"));
     borderPane.setBottom(root);
          String idStr=idField.getText();
        String username=nameField.getText();
       // String customerpassword=customerpasswordField.getText();
       // String email=emailField.getText();
        String mobile=mobileField.getText();
        String address=addressField.getText();
         if(username.isEmpty() ||  mobile.isEmpty()|| address.isEmpty()){
            Alert alert =new Alert(AlertType.ERROR);
            alert.setContentText("please fill out of fiels.");
            alert.show();
            return;
        }
        try {
             int id=Integer.parseInt(idStr);
        Customer customer=new Customer(id,username,mobile,address);
      // customerDAO.saveCustomer(customer); 
       System.out.println("save customer");
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Successfully Save");
            alert.show();
            clearForm();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  private void clearForm() {
       idField.clear();
       nameField.clear();
       mobileField.clear();
       addressField.clear();
       
    }
       
//         Alert alert=new Alert(AlertType.INFORMATION);
//         alert.setContentText("Success");
//         alert.show();
     

    @FXML
    private void loadAdminView(ActionEvent event) {
    }
      
}

 
        
    

    
    

