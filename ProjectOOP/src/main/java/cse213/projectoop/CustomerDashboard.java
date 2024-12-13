package cse213.projectoop;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerDashboard {

    @javafx.fxml.FXML
    private Button muttonButton;
    @javafx.fxml.FXML
    private Button policyButtonCD;
    @javafx.fxml.FXML
    private Button sausagesButton; // Corrected to match FXML name
    @javafx.fxml.FXML
    private Button cartButton; // Corrected to match FXML name
    @javafx.fxml.FXML
    private Button customerServiceButtonCD; // Corrected to match FXML name
    @javafx.fxml.FXML
    private Button fishButton; // Corrected to match FXML name
    @javafx.fxml.FXML
    private Button beefButton; // Corrected to match FXML name
    @javafx.fxml.FXML
    private MenuBar customerDashboardMenuBar; // Corrected to match FXML name
    @javafx.fxml.FXML
    private Button poultryButton; // Corrected to match FXML name

    @javafx.fxml.FXML
    public void initialize() {
        // Add action handlers for buttons
        muttonButton.setOnAction(event -> handleCategorySelection("Mutton"));
        poultryButton.setOnAction(event -> handleCategorySelection("Poultry"));
        fishButton.setOnAction(event -> handleCategorySelection("Fish"));
        beefButton.setOnAction(event -> handleCategorySelection("Beef"));
        sausagesButton.setOnAction(event -> handleCategorySelection("Sausages"));
        cartButton.setOnAction(event -> handleCart());
        customerServiceButtonCD.setOnAction(event -> handleCustomerService());
        policyButtonCD.setOnAction(event -> handlePolicy());
    }

    private void handleCategorySelection(String category) {
        // Logic for handling category selection (e.g., loading a new scene)
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(category + "Scene.fxml"));
            Scene categoryScene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) muttonButton.getScene().getWindow(); // Get current stage
            currentStage.setScene(categoryScene); // Switch to category-specific scene
        } catch (IOException e) {
            showError("Error loading " + category + " page: " + e.getMessage());
        }
    }

    private void handleCart() {
        // Logic to load the cart scene
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Cart.fxml"));
            Scene cartScene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) cartButton.getScene().getWindow(); // Get current stage
            currentStage.setScene(cartScene); // Switch to the cart scene
        } catch (IOException e) {
            showError("Error loading Cart page: " + e.getMessage());
        }
    }

    private void handleCustomerService() {
        // Logic to load the customer service scene
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomerService.fxml"));
            Scene customerServiceScene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) customerServiceButtonCD.getScene().getWindow(); // Get current stage
            currentStage.setScene(customerServiceScene); // Switch to customer service scene
        } catch (IOException e) {
            showError("Error loading Customer Service page: " + e.getMessage());
        }
    }

    private void handlePolicy() {
        // Logic to display policy or load policy scene
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Policy.fxml"));
            Scene policyScene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) policyButtonCD.getScene().getWindow(); // Get current stage
            currentStage.setScene(policyScene); // Switch to policy scene
        } catch (IOException e) {
            showError("Error loading Policy page: " + e.getMessage());
        }
    }

    private void showError(String message) {
        System.err.println(message); // Display error in console (use alerts if necessary)
    }

    // Getters and setters (Optional: If not actively used, you can remove them to reduce clutter)
    public Button getMuttonButton() {
        return muttonButton;
    }

    public void setMuttonButton(Button muttonButton) {
        this.muttonButton = muttonButton;
    }

    public Button getPolicyButtonCD() {
        return policyButtonCD;
    }

    public void setPolicyButtonCD(Button policyButtonCD) {
        this.policyButtonCD = policyButtonCD;
    }

    @Override
    public String toString() {
        return "CustomerDashboard{" +
                "muttonButton=" + muttonButton +
                ", policyButtonCD=" + policyButtonCD +
                ", sausagesButton=" + sausagesButton +
                ", cartButton=" + cartButton +
                ", customerServiceButtonCD=" + customerServiceButtonCD +
                ", fishButton=" + fishButton +
                ", beefButton=" + beefButton +
                ", customerDashboardMenuBar=" + customerDashboardMenuBar +
                ", poultryButton=" + poultryButton +
                '}';
    }
}