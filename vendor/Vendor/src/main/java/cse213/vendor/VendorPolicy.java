package cse213.vendor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class VendorPolicy {
    @javafx.fxml.FXML
    private CheckBox TearmsCheckBoxVP;
    @javafx.fxml.FXML
    private Button DownloadButtonVP;
    @javafx.fxml.FXML
    private Button BackButtonVP;
    @javafx.fxml.FXML
    private Button AcceptButtonVP;

    @javafx.fxml.FXML
    public void TearmsCheckBoxVPOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AcceptButtonVPOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DownloadButtonVPOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButtonVPOA(ActionEvent actionEvent) {
        loadPreviousScene();
    }

    private void loadPreviousScene() {
        try {
            FXMLLoader myFxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource("VendorDashboard.fxml")
            );

            Stage currentStage = (Stage) BackButtonVP.getScene().getWindow();
            currentStage.setScene(new Scene(myFxmlLoader.load()));
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
