package cse213.projectoop;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sun.awt.windows.WTextComponentPeer;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class loginController {
    @FXML
    private TextField userIDTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button createAccountButton;


    ArrayList<Admin> adminArrayList = new ArrayList<>();
    ArrayList<Employee> employeeArrayList = new ArrayList<>();
    ArrayList<ShopManager> shopManagerArrayList;


    @FXML
    public void initialize() {
        Admin a = new Admin("1234", "Admin", "123456", "admin@gmail.com", "01798765431", "Admin") ;
        adminArrayList.add(a) ;
        System.out.println(a);
    }


    @FXML
    public void createAccountButtonOnAction(ActionEvent actionEvent) {

        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cse213.projectoop.CreateAccount.fxml"));
        root = fxmlLoader.load() ;
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.show();
    }
    }


    @FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        String id, password;
        id = userIDTextField.getText();
        password = passwordField.getText();


        ShopManagerArrayList = ShopManagerDataRead() ;

        if (Objects.equals(id, "admin")) {
            for (Admin admin : adminArrayList) {
                if (admin.loginVR(id, password)) {
                    Parent root = null ;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cse213.projectoop.AdminDashboard.fxml"));
                    root = fxmlLoader.load() ;

                    AdminDashboardController adc = fxmlLoader.getController() ;
                    adc.setter(admin);

                    Scene scene = new Scene(root) ;
                    Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
                    stage.setScene(scene);
                    stage.show();
                }
            }
        }
        else if (id.length() == 7) {
            for (Employee employee: employeeArrayList) {
                if (employee.loginVR(id, password)) {
                    System.out.println("Student login uccessfully");
                    break;
                }
            }
        }
        else if (id.length() == 4) {
            for (ShopManager shopManager: shopManagerArrayList) {
                System.out.println(ShopManager);
                if (ShopManager.loginVR(id, password)) {
                    Parent root = null ;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cse213.projectoop.ShopManagerDashboard.fxml"));
                    root = fxmlLoader.load() ;

                    ShopManagerDashboardController fdc = fxmlLoader.getController() ;
                    fdc.setter(shopManager);

                    Scene scene = new Scene(root) ;
                    Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
                    stage.setScene(scene);
                    stage.show();
                    break;
                }
            }
        }
    }

public ObservableList<ShopManager> facultyDataRead() {
    ObservableList<ShopManager> faculties = FXCollections.observableArrayList() ;

    File f = null;
    FileInputStream fis = null;
    ObjectInputStream ois = null;

    try {
        f = new File("FacultyData.bin");
        fis = new FileInputStream(f);
        ois = new ObjectInputStream(fis);
        ShopManager st ;
        try {
            while(true){
                st = (ShopManager) ois.readObject();
                System.out.println((st));
                faculties.add(st) ;
            }
        }//end of nested try
        catch(Exception e){
            // handling code
        }//nested catch
    } catch (IOException ex) {
        System.out.println(ex.toString());
    }
    finally {
        try {
            if(ois != null) ois.close();
        } catch (IOException ex) { }
    }

    return ShopManagers ;
}

public void main() {
}
