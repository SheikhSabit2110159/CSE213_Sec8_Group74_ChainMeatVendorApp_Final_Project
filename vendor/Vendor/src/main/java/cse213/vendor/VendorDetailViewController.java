package cse213.vendor;

import javafx.scene.control.Label;

public class VendorDetailViewController {
    @javafx.fxml.FXML
    private Label visitorIdLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public void receiveDataFromOtherController(int val) {
        visitorIdLabel.setText(Integer.toString(val));
    }

}

