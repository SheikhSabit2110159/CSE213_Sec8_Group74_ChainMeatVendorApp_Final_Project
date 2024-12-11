package cse213.projectoop;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CreateNewAccount {
    @javafx.fxml.FXML
    private TextField PhoneNumberTextFieldCNA;
    @javafx.fxml.FXML
    private TextField NameTextFieldCNA;
    @javafx.fxml.FXML
    private TextField RetypePasswordCNA;
    @javafx.fxml.FXML
    private TextField PasswordTextFieldCNA;
    @javafx.fxml.FXML
    private RadioButton othersRadioButtonCNA;
    @javafx.fxml.FXML
    private RadioButton maleRadioButtonCNA;
    @javafx.fxml.FXML
    private RadioButton FemaleRadioButtonCNA;

    ToggleGroup tg;
    @javafx.fxml.FXML
    public void initialize() {
        tg = new ToggleGroup();
        maleRadioButtonCNA.setToggleGroup(tg);
        FemaleRadioButtonCNA.setToggleGroup(tg);
        othersRadioButtonCNA.setToggleGroup(tg);}
}