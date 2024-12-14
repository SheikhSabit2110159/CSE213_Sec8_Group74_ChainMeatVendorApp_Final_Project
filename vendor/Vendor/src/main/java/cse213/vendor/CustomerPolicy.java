package cse213.vendor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CustomerPolicy {
    @javafx.fxml.FXML
    private Button BackButtonCP;
    @javafx.fxml.FXML
    private Button AcceptButtonCP;

    @javafx.fxml.FXML
    public void AcceptButtonCPOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButtonCPOA(ActionEvent actionEvent) {
        loadPreviousScene();
    }
    private void loadPreviousScene() {
    try {
        FXMLLoader myFxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("CustomerDashboard.fxml")
        );

        Stage currentStage = (Stage) BackButtonCP.getScene().getWindow();
        currentStage.setScene(new Scene(myFxmlLoader.load()));
    } catch (Exception e) {
        e.printStackTrace();

    }}


}
