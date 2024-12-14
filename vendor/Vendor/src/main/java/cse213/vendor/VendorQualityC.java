package cse213.vendor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VendorQualityC {
    @javafx.fxml.FXML
    private Button BackButtonVQ;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButtonVQOA(ActionEvent actionEvent) {
        loadPreviousScene();
    }



        private void loadPreviousScene(){
            try {
                FXMLLoader myFxmlLoader = new FXMLLoader(
                        HelloApplication.class.getResource("VendorDashboard.fxml")
                );

                Stage currentStage = (Stage) BackButtonVQ.getScene().getWindow();
                currentStage.setScene(new Scene(myFxmlLoader.load()));
            } catch (Exception e) {
                e.printStackTrace();


            }
        }
    }