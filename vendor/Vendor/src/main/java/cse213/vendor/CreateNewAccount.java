package cse213.vendor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateNewAccount {

    @FXML
    private TextField PhoneNumberTextFieldCNA;
    @FXML
    private TextField EmailTextFieldCNA;
    @FXML
    private RadioButton othersRadioButtonCNA;
    @FXML
    private TextField NameTextFieldCNA;
    @FXML
    private RadioButton maleRadioButtonCNA;
    @FXML
    private CheckBox agreedCheckBoxCNA;
    @FXML
    private ComboBox UsertypeCoboBoxCNA;
    @FXML
    private Button SignUpCNA;
    @FXML
    private TextField RetypePasswordCNA;
    @FXML
    private RadioButton FemaleRadioButtonCNA;
    @FXML
    private PasswordField PasswordTextFieldCNA;
    @FXML
    private void handleCreateAccountButtonClick() {
        String userId = NameTextFieldCNA.getText();
        String email = EmailTextFieldCNA.getText();
        String contactNumber = PhoneNumberTextFieldCNA.getText();
        String password = PasswordTextFieldCNA.getText();  // Correct usage of getText()

        if (userId.isEmpty() || email.isEmpty() || contactNumber.isEmpty() || password.isEmpty()) {
            showAlert("Account Creation Failed", "All fields are required.");
        } else if (!email.endsWith(".com")) {
            showAlert("Account Creation Failed", "Email must end with '.com'.");
        } else if (contactNumber.length() != 11 || !contactNumber.matches("\\d+")) {
            showAlert("Account Creation Failed", "Contact number must have exactly 11 digits.");
        } else {

            System.out.println("Account created for: " + userId);
            showAlert("Account Created", "Your account has been successfully created!");


            switchToLogin();
        }
    }


    @FXML
    private void handleBackToLoginButtonClick() {
        switchToLogin();
    }


    private void switchToLogin() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cse213/projectoop/Login.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = (Stage) SignUpCNA.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Login");
            stage.show();
        } catch (IOException e) {
            System.err.println("Error loading Login scene: " + e.getMessage());
            e.printStackTrace();
        }
    }


    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void handleSignUpCNA(ActionEvent actionEvent) {

    }

    ToggleGroup tg;

    @FXML
    public void initialize() {
        tg = new ToggleGroup();
        maleRadioButtonCNA.setToggleGroup(tg);
        FemaleRadioButtonCNA.setToggleGroup(tg);
        othersRadioButtonCNA.setToggleGroup(tg);
    }
}
