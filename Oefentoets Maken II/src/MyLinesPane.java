import java.util.ArrayList;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MyLinesPane extends MyAbstractPane {

	// constants
	private double margin = 10;

	// instance variabeles
	private ArrayList<Line> lines;
	private Pane centerpane;
	private Color linecolor;

	// constructor
	public MyLinesPane(Color backgroundcolor, Color linec, MyScene scene) {
		super(backgroundcolor, scene);
		super.setTextOnButton("line");
		linecolor = linec;
		lines = new ArrayList<Line>();
		centerpane = new Pane();
		setCenter(centerpane);
	}

	@Override
	public void doIt() {
		if (lines.size() < 26) {
			double n = lines.size() + 1;
			double linewidth = this.getWidth() - margin;
			Line newline = new Line(margin, margin * n, linewidth, margin * n);
			newline.setStrokeWidth(4);
			newline.setStroke(linecolor);
			lines.add(newline);
			showLines();
		}
	}

	private void showLines() {
		centerpane.getChildren().clear();
		centerpane.getChildren().addAll(lines);
	}

}
