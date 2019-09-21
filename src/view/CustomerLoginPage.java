package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class CustomerLoginPage extends BorderPane{

	public CustomerLoginPage() {
		GridPane loginPane = new GridPane();
		
		Label userName = new Label("User Name: ");
		userName.setTextFill(Color.BLACK);
		userName.setFont( new Font( "Arial",  24 ) );
		Label passWord = new Label("Password: ");
		passWord.setTextFill(Color.BLACK);
		passWord.setFont( new Font( "Arial",  24 ) );
		
		TextField userNameTextField = new TextField();
		PasswordField passWordTextField = new PasswordField();
		
		loginPane.setVgap(30);
		loginPane.add(userName, 0, 0);
		loginPane.add(userNameTextField, 1, 0);
		loginPane.add(passWord, 0, 1);
		loginPane.add(passWordTextField, 1, 1);
		setPadding(new Insets(50));
		loginPane.setAlignment(Pos.CENTER);
		
		
		
		HBox hBox = new HBox(430);
		VBox vBox = new VBox();
		Button loginButton = new Button("Login");
		loginButton.setFont(new Font("Arial", 18));
		vBox.getChildren().add(loginButton);
		Button mainMenu = new Button("Main Menu");
		mainMenu.setFont(new Font("Arial", 18));
		hBox.getChildren().addAll(vBox, mainMenu);
		hBox.setAlignment(Pos.BASELINE_RIGHT);
		setBottom(hBox);
		setCenter(loginPane);
	}
}
