package cse213.vendor;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;

public class CustomerDFish
{
    @javafx.fxml.FXML
    private TableView TableViewCD1;
    @javafx.fxml.FXML
    private ComboBox<String> ProductNameComboBoxCD1;
    @javafx.fxml.FXML
    private ComboBox<String> QuantityComboBoxCD1;
    @javafx.fxml.FXML
    private Button AddtoCartButtonCD1;
    @javafx.fxml.FXML
    private Button placeOrderButtonCD1;
    @javafx.fxml.FXML
    private ComboBox<String> weightComboBoxCD1;

    @javafx.fxml.FXML
    public void initialize() {
        QuantityComboBoxCD1.getItems().addAll("1", "2", "3", "4", "5");
        weightComboBoxCD1.getItems().addAll("250g","1KG", "2KG", "3KG", "4KG", "5KG");
        ProductNameComboBoxCD1.getItems().addAll("Katol Fish", "Rupchanda Fish", "Black Tiger Prawn", "Pabda Fish", "Bata Fish");

    }}