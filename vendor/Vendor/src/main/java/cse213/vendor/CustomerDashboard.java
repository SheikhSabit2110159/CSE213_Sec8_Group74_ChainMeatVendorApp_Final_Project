package cse213.vendor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerDashboard {

    @javafx.fxml.FXML
    private Button muttonButton;
    @javafx.fxml.FXML
    private Button policyButtonCD;
    @javafx.fxml.FXML
    private Button SausagesButton;
    @javafx.fxml.FXML
    private Button CustomerServiceButtonCD;
    @javafx.fxml.FXML
    private Button FishButton;
    @javafx.fxml.FXML
    private Button Beefutton;
    @javafx.fxml.FXML
    private MenuBar CustomerDaashboardMenuBar;
    @javafx.fxml.FXML
    private Button PoultryButton;
    @javafx.fxml.FXML
    private BorderPane BorderPaneCD;
    @javafx.fxml.FXML
    private Button CartButtonCD;
    @javafx.fxml.FXML
    private Button OrderButtonCD;

    @javafx.fxml.FXML
    public void policyButtonCDOA(ActionEvent actionEvent) {
        loadScene("CustomerPolicy.fxml");
    }

    @javafx.fxml.FXML
    public void CustomerServiceButtonCDOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PoultryButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FishButtonOA(ActionEvent actionEvent) {
        loadScene("CustomerDFish.fxml");
    }

    @javafx.fxml.FXML
    public void CartButtonOA(ActionEvent actionEvent) {
        loadScene("ShippingDetails.fxml");
    }

    @javafx.fxml.FXML
    public void muttonButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BeefuttonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OrderButtonCDOA(ActionEvent actionEvent) {
        loadScene("ShippingDetails.fxml");
    }

    private void loadScene(String fxmlFileName) {
        try {
            FXMLLoader myFxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(fxmlFileName)
            );
            BorderPaneCD.setCenter(myFxmlLoader.load());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

