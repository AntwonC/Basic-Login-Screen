
package messingwithscenebuilder;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;



public class FXMLDocumentController implements Initializable {
    
   
    
    // Password unmasked
    @FXML
     TextField passwordTextField;
    // Actual passwordField
    @FXML
     PasswordField passwordField;
    @FXML
     CheckBox checkBoxPassword;
    @FXML
    private Label usernameLabel;
    @FXML
    private Label passwordLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private Button loginButton;
    @FXML
    private GridPane root;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML 
    public void loginButtonClicked()    {
        System.out.println("You are now logged in!");
    }
    
    @FXML
    public void checkBoxChecked(ActionEvent event)   {
       
        passwordTextField.setManaged(false);
        passwordTextField.setVisible(false);
        
        
        passwordTextField.managedProperty().bind(checkBoxPassword.selectedProperty());
        passwordTextField.visibleProperty().bind(checkBoxPassword.selectedProperty());
        
        passwordField.managedProperty().bind(checkBoxPassword.selectedProperty().not());
        passwordField.visibleProperty().bind(checkBoxPassword.selectedProperty().not());
        
        passwordTextField.textProperty().bindBidirectional(passwordField.textProperty());
     
        
   
      
    }
    
}
    
        
    

