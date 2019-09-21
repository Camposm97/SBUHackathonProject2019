package view;

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
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import util.FXUtil;

public class CustomerLoginPage extends BorderPane {

	public CustomerLoginPage() {
		GridPane loginPane = new GridPane();

		Label userName = new Label("Username: ");
		userName.setFont(new Font(24));
		Label passWord = new Label("Password: ");
		passWord.setFont(new Font(24));

		TextField userNameTextField = new TextField();
		PasswordField passWordTextField = new PasswordField();

		loginPane.setVgap(10);
		loginPane.add(FXUtil.loadVBox(FXUtil.loadHBox(userName, userNameTextField),
				FXUtil.loadHBox(passWord, passWordTextField)), 0, 0);
		loginPane.add(new Button("Login"), 0, 2, 4, 1);
		setPadding(new Insets(25));
		loginPane.setAlignment(Pos.CENTER);

		HBox hBox = new HBox(10);
		VBox vBox = new VBox();
		Button loginButton = new Button("Login");
		loginButton.setFont(new Font("Arial", 18));
		vBox.getChildren().add(loginButton);
		Button btGoBack = new Button("Go Back");
		btGoBack.setOnAction(e -> {
			Scene scene = this.getScene();
			scene.setRoot(new MainPage());
		});
		btGoBack.setFont(new Font("Arial", 18));
		hBox.getChildren().addAll(vBox, btGoBack);
		hBox.setAlignment(Pos.BASELINE_RIGHT);
		setBottom(hBox);
		setCenter(loginPane);
	}
}
