import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static Scene scene;

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
		AnchorPane root = loader.load();

		scene = new Scene(root);
		primaryStage.setTitle("Window Title");
		primaryStage.setScene(scene);


		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
