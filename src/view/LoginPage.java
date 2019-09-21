package view;

import app.App;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public abstract class LoginPage extends BorderPane {
	protected Button btLogin;
	
	public LoginPage() {
		Label lblTitle = new Label(App.TITLE);
		lblTitle.setFont(Font.font(48));
		setTop(new StackPane(lblTitle));
	}
	
	public abstract Button loadBtLogin();
}
