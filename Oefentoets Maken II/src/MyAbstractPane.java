import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public abstract class MyAbstractPane extends BorderPane {

	// constants
	final private double paneHeight = 400;
	final private double paneWidth = 150;

	// instance variables
	private MyScene myscene;
	private MyButtonPane buttonpane;

	// constructor
	public MyAbstractPane(Color color, MyScene scene) {
		myscene = scene;
		Background bg = new Background(new BackgroundFill(color, null, null));
		setBackground(bg);
		setPrefHeight(paneHeight);
		setPrefWidth(paneWidth);
		buttonpane = new MyButtonPane(this);
		setBottom(buttonpane);
	}

	public void setFirst() {
		myscene.setFirst(this);
	}

	public void setTextOnButton(String text) {
		buttonpane.setTextOnButton(text);
	}

	public abstract void doIt();

}
