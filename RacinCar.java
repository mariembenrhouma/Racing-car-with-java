/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariem
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

public class RacinCar extends Application {
	@Override // Override the start method on the Application class
	public void start(Stage primaryStage) {
		// Create a car
		CarPane pane = new CarPane();

		// Create and register handles
		pane.setOnMousePressed(e -> pane.pause());
		pane.setOnMouseReleased(e -> pane.play());

		pane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.UP) {
				pane.increaseSpeed();
			}
			else if (e.getCode() == KeyCode.DOWN) {
				pane.decreaseSpeed();
			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 600, 100);
		primaryStage.setTitle("Racing Car"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		pane.requestFocus(); // Request focus
	}
        public static void main(String[] args) {
        Application.launch(args);

    }

}
