import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application{

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage stage) throws Exception {
		MyScene myScene = new MyScene();
		stage.setResizable(false);
		stage.setScene(myScene);
		stage.setTitle("PROG3 - Redmar Alkema - Lines");
		stage.show();
	}
}
