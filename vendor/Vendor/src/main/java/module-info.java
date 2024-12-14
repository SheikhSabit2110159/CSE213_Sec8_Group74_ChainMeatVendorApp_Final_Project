module cse213.vendor {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.vendor to javafx.fxml;
    exports cse213.vendor;
}