package cse213.vendor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {

    @FXML
    private TextField UserIDTextField;

    @FXML
    private PasswordField LoginPasswordField;

    @FXML
    private Button LogInButton1;

    @FXML
    private Button ForgotPasswordButton;

    @FXML
    private Button CreateAccountButton;

    // Handle Login button click
    @FXML
    private void handleLoginButtonClick() {
        String userId = UserIDTextField.getText();
        String password = LoginPasswordField.getText();

        if (userId.isEmpty() || password.isEmpty()) {
            showAlert("Login Failed", "User ID and Password cannot be empty.");
            return;
        }

        if (UserService.login(userId, password)) {
            String userType = UserService.getUserType(userId);  // Get the user type

            if ("Customer".equals(userType)) {
                navigateToDashboard("CustomerDashboard.fxml");
            } else if ("Vendor".equals(userType)) {
                navigateToDashboard("VendorDashboard.fxml");
            } else {
                showAlert("Login Failed", "Invalid user type.");
            }
        } else {
            showAlert("Login Failed", "Invalid credentials or user does not exist.");
        }
    }

    // Handle Create Account button click
    @FXML
    private void handleCreateNewAccountButtonClick() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cse213/vendor/CreateNewAccount.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = (Stage) CreateAccountButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Create Account");
            stage.show();
        } catch (IOException e) {
            showErrorAlert("Error loading Create Account scene: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method to navigate to the respective dashboard
    private void navigateToDashboard(String fxmlFile) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cse213/projectoop/" + fxmlFile));
            Parent root = fxmlLoader.load();

            Stage stage = (Stage) LogInButton1.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(fxmlFile.equals("CustomerDashboard.fxml") ? "Customer Dashboard" : "Vendor Dashboard");
            stage.show();
        } catch (IOException e) {
            showErrorAlert("Error loading dashboard scene: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Utility to show alerts
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Utility to show error alerts
    private void showErrorAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}