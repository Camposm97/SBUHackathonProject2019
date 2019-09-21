package control;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class MyLabel extends Label {
	public MyLabel(String text, int fontSize) {
		super(text);
		super.setFont(Font.font(fontSize));
	}
}
