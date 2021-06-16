package Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application{

	Button button;

	public static void main(String[] args) {
        launch(args);
    }
	
    @Override
    public void start(Stage stage) throws IOException {
    	stage.setTitle("XD");
    	Parent root=FXMLLoader.load(getClass().getResource("/Vistas/SistemaEmergencias.fxml"));
    	
    	Scene scene=new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    }

    
}