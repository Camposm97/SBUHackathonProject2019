package view;

import app.App;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public abstract class LoginPage extends BorderPane {
	protected GridPane gridPane;
	protected Button btLogin;
	protected Label lblNote, lblUsername, lblPassword;
	protected TextField tfUsername;
	protected PasswordField tfPassword;
	
	public LoginPage() {
		Label lblTitle = new Label(App.TITLE);
		lblTitle.setFont(Font.font(48));
		gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		lblNote = new Label("Please enter your crendentials.");
		lblNote.setFont(new Font(24));
		lblUsername = new Label("Username: ");
		lblUsername.setFont(new Font(24));
		lblPassword = new Label("Password: ");
		lblPassword.setFont( new Font(24));		
		tfUsername = new TextField();
		tfPassword = new PasswordField();
		setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				btLogin.fire();
			}
		});
		setTop(new StackPane(lblTitle));
		gridPane.add(new StackPane(lblNote), 0, 0, 2, 1);
		gridPane.add(lblUsername, 0, 1);
		gridPane.add(tfUsername, 1, 1);
		gridPane.add(lblPassword, 0, 2);
		gridPane.add(tfPassword, 1, 2);
	}
	
	public abstract GridPane buildGridPane();
	
	public abstract Button loadBtLogin();
}
