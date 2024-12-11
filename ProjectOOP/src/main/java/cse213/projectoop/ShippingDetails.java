package cse213.projectoop;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class ShippingDetails {
    @javafx.fxml.FXML
    private ComboBox<String> DeliveryMethodComboBox;
    @javafx.fxml.FXML
    private Button ConfirmOrderButton;
    @javafx.fxml.FXML
    private ComboBox<String> PaymentMethodComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        DeliveryMethodComboBox.getItems().addAll("Home Delivery", "Pick Up");
        PaymentMethodComboBox.getItems().addAll("Online Payment","Cash on delivery");


    }}

