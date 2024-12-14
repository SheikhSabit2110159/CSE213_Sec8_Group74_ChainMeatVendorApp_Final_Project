package cse213.vendor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class VendorAddProduct
{
    @javafx.fxml.FXML
    private Button AddButtonVAP;
    @javafx.fxml.FXML
    private TableView TableViewVAP;
    @javafx.fxml.FXML
    private ComboBox<String> ProductNameComboBoxVAP;
    @javafx.fxml.FXML
    private Button QualityControlButtonVAP;
    @javafx.fxml.FXML
    private ComboBox <String> QuantityComboBoxVAP;
    @javafx.fxml.FXML
    private Button PolicyButtonVAP;
    @javafx.fxml.FXML
    private ComboBox <String>WeightComboBoxVAP;
    @javafx.fxml.FXML
    private CheckBox CheckBoxVAP;
    @javafx.fxml.FXML
    private Button BackButtonVAP;

    @javafx.fxml.FXML
    public void initialize() {
        ProductNameComboBoxVAP.getItems().addAll("Fish", "Beef", "Mutton", "Others");
        QuantityComboBoxVAP.getItems().addAll("1", "2", "3", "4", "Other");
        WeightComboBoxVAP.getItems().addAll("1KG", "2KG", "3KG", "4KG", "Other");
    }

    @javafx.fxml.FXML
    public void QualityControlButtonVAPOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CheckBoxVAPOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PolicyButtonVAPOA(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void BackButtonVAPOA(ActionEvent actionEvent) {
        loadPreviousScene();
    }
    private void loadPreviousScene() {
        try {
            FXMLLoader myFxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource("VendorDashboard.fxml")
            );

            Stage currentStage = (Stage) BackButtonVAP.getScene().getWindow();
            currentStage.setScene(new Scene(myFxmlLoader.load()));
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
