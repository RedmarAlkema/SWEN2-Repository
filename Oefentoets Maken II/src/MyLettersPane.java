import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class MyLettersPane extends MyAbstractPane {

	// constants
	private final double margin = 10;
	final private Font myfont = Font.font("arial", FontWeight.BOLD, 30);

	// instance variabeles
	private ArrayList<Shape> letters;
	private Pane centerpane;
	private Color linecolor;

	// constructor
	public MyLettersPane(Color backgroundcolor, Color linec, MyScene scene) {
		super(backgroundcolor, scene);
		super.setTextOnButton("letter");
		linecolor = linec;
		letters = new ArrayList<Shape>();
		centerpane = new FlowPane(5, 5);
		centerpane.setPadding(new Insets(margin));
		setCenter(centerpane);
	}

	@Override
	public void doIt() {
		if (letters.size() < 26) {
			char c = (char) ('A' + letters.size());
			Text letter = new Text("" + c);
			letter.setFont(myfont);
			letter.setStrokeWidth(2);
			if (linecolor == Color.BLACK) {
				letter.setFill(Color.WHITE);
			}
			else {
				letter.setFill(Color.BLACK);
			}
			letter.setStroke(linecolor);
			letters.add(letter);
			showLetters();
		}
	}

	private void showLetters() {
		centerpane.getChildren().clear();
		centerpane.getChildren().addAll(letters);
	}

}
