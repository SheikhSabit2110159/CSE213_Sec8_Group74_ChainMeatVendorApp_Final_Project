module cse213.projectoop {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.projectoop to javafx.fxml;
    exports cse213.projectoop;
    exports Customer;
    opens Customer to javafx.fxml;
    exports Vendor;
    opens Vendor to javafx.fxml;
}