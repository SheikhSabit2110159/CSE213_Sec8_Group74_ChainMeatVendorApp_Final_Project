package cse213.projectoop;

import javafx.collections.FXCollections;

import java.io.*;
import java.time.LocalDate;

public Admin(String name, String password, String email, String pN, String type) {
    super(name, password, email, pN, type);
}

public void addShopManager(String name, String password, String email, String pN, String type, String department, String gender, LocalDate dob, LocalDate doj) {
    ShopManager shopManager = new ShopManager(name, password, email, pN, type, department, gender, dob, doj) ;
    this.ShopManagerFileWrite(shopManager);
}


public void main() {
}