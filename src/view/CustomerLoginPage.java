package view;

import app.App;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model.CustomerAccount;
import model.UserAccount;

public class CustomerLoginPage extends LoginPage {

	public CustomerLoginPage() {
		btLogin = loadBtLogin();
		setCenter(buildGridPane());
	}

	@Override
	public GridPane buildGridPane() {
		Button btGoBack = new Button("Go Back");
		btGoBack.setOnAction(e -> {
			Scene scene = this.getScene();
			scene.setRoot(new MainPage());
		});
		gridPane.add(new StackPane(btLogin), 0, 3, 4, 1);
		setPadding(new Insets(25));
		HBox hBox = new HBox(10);
		btGoBack.setFont(new Font(16));
		hBox.getChildren().addAll(btGoBack);
		hBox.setAlignment(Pos.BOTTOM_LEFT);
		setBottom(hBox);
		return gridPane;
	}

	@Override
	public Button loadBtLogin() {
		Button bt = new Button("Login");
		bt.setPrefWidth(128);
		bt.setOnAction(e -> { tryToLogin(); });
		bt.setFont(new Font(16));
		return bt;
	}

	private void tryToLogin() {
		// Attempt to Login
		String username = tfUsername.getText();
		String password = tfPassword.getText();
		UserAccount user = App.accts.get(username);
		if (user != null && user instanceof CustomerAccount) {
			if (user.getPassword().equals(password)) {
				lblNote.setText("Login Successful! :D");
				lblNote.setTextFill(Color.GREEN);
				Scene scene = getScene();
				scene.setRoot(new CustomerProfilePage((CustomerAccount) user));
			} else {
				lblNote.setText("Failed to Login :(");
				lblNote.setTextFill(Color.RED);
			}
		} else {
			lblNote.setText("That username does not exist!");
			lblNote.setTextFill(Color.RED);
		}
	}
}
