import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class MyScene extends Scene {

	// instance variables
	private Pane root;

	// constructor
	public MyScene() {
		super(new Pane());
		root = new HBox();
		root.getChildren().add(new MyLinesPane(Color.ORANGE, Color.BLACK, this));
		root.getChildren().add(new MyLinesPane(Color.DARKGREEN, Color.WHITE, this));
		root.getChildren().add(new MyLettersPane(Color.LIGHTBLUE, Color.BLACK, this));
		root.getChildren().add(new MyLettersPane(Color.PURPLE, Color.WHITE, this));
		this.setRoot(root);
	}

	public void setFirst(MyAbstractPane current) {
		root.getChildren().remove(current);
		root.getChildren().add(0, current);
	}

}
