package cse213.projectoop;

public class Dashboard {
    @javafx.fxml.FXML
    private Label dateL;
    @javafx.fxml.FXML
    private Label userNameL;
    @javafx.fxml.FXML
    private Label userTypeL;

    ShopManager user ;

    public void setter(ShopManager ShopManager) {
        this.user = ShopManager ;
        userNameL.setText(this.user.getName());
        dateL.setText(LocalDate.now().toString());
    }

    @javafx.fxml.FXML
    public void initialize() {
    }}


}
