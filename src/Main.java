import game.ui.GamePane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Entry Point for the JavaFX Application
 * @author <YOUR DETAILS HERE>
 *
 */
public class Main extends Application{
	
	/**
	 * Main entry point for the program
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Default start method provided by the JavaFX Application
	 * @param primaryStage The stage created during JavaFX startup process
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		/* TODO: Set up your Scene and Stage */
		GamePane gPane = new GamePane();
		Scene scene = new Scene(gPane, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
