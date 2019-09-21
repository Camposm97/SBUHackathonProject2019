package view;

import app.App;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class CustomerLoginPage extends BorderPane {

	public CustomerLoginPage() {
		Label lblTitle = new Label(App.TITLE);
		lblTitle.setFont(Font.font(48));
		setTop(new StackPane(lblTitle));
		setCenter(loadGridPane());
	}
	
	private GridPane loadGridPane() {
		GridPane gridPane = new GridPane();
		Label lblUsername = new Label("Username: ");
		lblUsername.setFont( new Font(24));
		Label lblPassword = new Label("Password: ");
		lblPassword.setFont( new Font(24));		
		TextField tfUsername = new TextField();
		PasswordField tfPassword = new PasswordField();
		Button btLogin = new Button("Login");
		btLogin.setPrefWidth(128);
		btLogin.setOnAction(e -> {
			// Attempt to Login
			String username = tfUsername.getText();
			String password = tfPassword.getText();
		});
		btLogin.setFont(new Font(16));
		Button btGoBack = new Button("Go Back");
		btGoBack.setOnAction(e -> {
			Scene scene = this.getScene();
			scene.setRoot(new MainPage());
		});

		gridPane.setVgap(10);
		gridPane.add(lblUsername, 0, 0);
		gridPane.add(tfUsername, 1, 0);
		gridPane.add(lblPassword, 0, 1);
		gridPane.add(tfPassword, 1, 1);
		gridPane.add(new StackPane(btLogin), 0, 2, 4, 1);
		setPadding(new Insets(25));
		gridPane.setAlignment(Pos.CENTER);
		
		HBox hBox = new HBox(10);
		btGoBack.setFont(new Font(16));
		hBox.getChildren().addAll(btGoBack);
		hBox.setAlignment(Pos.BOTTOM_LEFT);
		setBottom(hBox);
		return gridPane;
	}
}
