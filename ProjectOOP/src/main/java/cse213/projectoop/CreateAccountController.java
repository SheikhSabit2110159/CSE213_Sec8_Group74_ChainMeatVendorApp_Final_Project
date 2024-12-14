package cse213.projectoop;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;

public class CreateAccountController {
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private Button CreateAccountButton;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ComboBox<String> departmentComboBox;
    @FXML
    private Label outputLabel;

    @FXML
    public void initialize(){

        departmentComboBox.getItems().addAll("CEO","Executive", "HR", "Seller");

    }



    @FXML
    public void createAccountButtonOnAction(ActionEvent actionEvent) {

        String name, email, phoneNumber, password, dept;

        name = nameTextField.getText();
        email = emailTextField.getText();
        phoneNumber = phoneNumberTextField.getText();
        password = passwordField.getText();
        dept = departmentComboBox.getValue();


        Employee employee = new Employee(name, password, email, phoneNumber, "Employee", dept);


        outputLabel.setText(employee.toString());
    }
}


