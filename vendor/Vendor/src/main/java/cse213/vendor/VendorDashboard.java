package cse213.vendor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class VendorDashboard {
    @javafx.fxml.FXML
    private Button QualityControlButtonVD;
    @javafx.fxml.FXML
    private Button ProductDemoudButtonVD;
    @javafx.fxml.FXML
    private Button FeedBacksButtonVD;
    @javafx.fxml.FXML
    private Button OurPolicyButtonVD;
    @javafx.fxml.FXML
    private Button PerformanceButtonVD;
    @javafx.fxml.FXML
    private Button InventoryButtonVD;
    @javafx.fxml.FXML
    private Button PricingButtonVD;
    @javafx.fxml.FXML
    private Button PaymentRequestButtonVD;
    @javafx.fxml.FXML
    private Button AddProductButtonVD;
    @javafx.fxml.FXML
    private BorderPane dashBoardBorderPaneV;

    @javafx.fxml.FXML
    public void PerformanceButtonVDOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void InventoryButtonVDOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FeedBacksButtonVDOA(ActionEvent actionEvent) {
        loadScene("VendorFeedBack.fxml");
    }

    @javafx.fxml.FXML
    public void OurPolicyButtonVDOA(ActionEvent actionEvent) {
        loadScene("VendorPolicy.fxml");
    }

    @javafx.fxml.FXML
    public void AddProductButtonVDOA(ActionEvent actionEvent) {
        loadScene("VendorAddProduct.fxml");
    }

    @javafx.fxml.FXML
    public void ProductDemoudButtonVDOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PricingButtonVDOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void QualityControlButtonVDOA(ActionEvent actionEvent) {
        loadScene("VendorQualityC.fxml");
    }

    @javafx.fxml.FXML
    public void PaymentRequestButtonVDOA(ActionEvent actionEvent) {
        loadScene("VendorPayment.fxml");
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void FeedBacksButtonVD(ActionEvent actionEvent) {
        loadScene("VendorFeedBack.fxml");
    }

    @javafx.fxml.FXML
    public void AddProductButtonVD(ActionEvent actionEvent) {
        loadScene("VendorAddProduct.fxml");
    }

    @javafx.fxml.FXML
    public void OurPolicyButtonVD(ActionEvent actionEvent) {
        loadScene("VendorPolicy.fxml");
    }




    private void loadScene(String fxmlFileName) {
        try {
            FXMLLoader myFxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(fxmlFileName)
            );
            dashBoardBorderPaneV.setCenter(myFxmlLoader.load());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}