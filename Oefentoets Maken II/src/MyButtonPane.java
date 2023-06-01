import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class MyButtonPane extends FlowPane {

	// constants
	private final double butWidth = 60;
	private final double butHeight = 10;
	private final double hgap = 10;
	private final double margin = 10;

	// instance variables
	private Button butFirst;
	private Button butDo;
	private MyAbstractPane owner;

	// constructor
	public MyButtonPane(MyAbstractPane abstractpane) {
		owner = abstractpane;
		butDo = new Button();
		butDo.setOnAction(e -> handleDo());
		butFirst = new Button("first");
		butFirst.setOnAction(e -> handleFirst());
		butDo.setPrefSize(butWidth, butHeight);
		butFirst.setPrefSize(butWidth, butHeight);

		this.setAlignment(Pos.BOTTOM_CENTER);
		this.setHgap(hgap);
		this.setPadding(new Insets(margin));
		getChildren().addAll(butFirst, butDo);
	}

	public void setTextOnButton(String text) {
		butDo.setText(text);
	}

	private void handleDo() {
		owner.doIt();
	}

	private void handleFirst() {
		owner.setFirst();
	}
}
