package control;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class ColorButton extends Button {
	public ColorButton(String text, Color color) {
		super(text);
		setOnMouseEntered(e -> {
			setTextFill(color);
		});
		setOnMouseExited(e -> {
			setTextFill(Color.BLACK);
		});
	}
}
