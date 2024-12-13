package cse213.projectoop; // Ensure this matches the package of your project

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {

    // Static method to switch scenes
    public static void switchScene(Stage stage, String fxmlFile) {
        try {
            // Load the FXML file corresponding to the scene
            Parent root = FXMLLoader.load(SceneSwitcher.class.getResource(fxmlFile));

            // Set the new scene and show it
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            // Handle the error gracefully
            System.out.println("Error loading the scene: " + fxmlFile);
            e.printStackTrace();
        }
    }

    // Optional: You can also add a method to load a scene with a controller
    public static void switchSceneWithController(Stage stage, String fxmlFile, Object controller) {
        try {
            FXMLLoader loader = new FXMLLoader(SceneSwitcher.class.getResource(fxmlFile));
            loader.setController(controller); // Set the controller
            Parent root = loader.load();

            // Set the new scene and show it
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            // Handle the error gracefully
            System.out.println("Error loading the scene with controller: " + fxmlFile);
            e.printStackTrace();
        }
    }
}
