package view;

import app.Demo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class CustomerRegistrationPage extends BorderPane {

	public CustomerRegistrationPage() {

		GridPane customerGridPane = new GridPane();
		Label customerFirstName = new Label("First Name: ");
		customerFirstName.setTextFill(Color.BLACK);
		customerFirstName.setFont(new Font("Arial", 24));
		Label customerLastName = new Label("Last Name: ");
		customerLastName.setTextFill(Color.BLACK);
		customerLastName.setFont(new Font("Arial", 24));
		Label customerEmail = new Label("Email Address: ");
		customerEmail.setTextFill(Color.BLACK);
		customerEmail.setFont(new Font("Arial", 24));
		Label customerPassword = new Label("Password: ");
		customerPassword.setTextFill(Color.BLACK);
		customerPassword.setFont(new Font("Arial", 24));
		Label customerStreetAddress = new Label("Street Name: ");
		customerStreetAddress.setTextFill(Color.BLACK);
		customerStreetAddress.setFont(new Font("Arial", 24));
		Label customerZipCode = new Label("Zipcode: ");
		customerZipCode.setTextFill(Color.BLACK);
		customerZipCode.setFont(new Font("Arial", 24));

		TextField customerFirstNameText = new TextField();
		TextField customerLastNameText = new TextField();
		TextField customerEmailText = new TextField();
		PasswordField customerPasswordText = new PasswordField();
		TextField customerStreetAddressText = new TextField();
		TextField customerZipCodeText = new TextField();

		Button customerGetProfilePic = new Button("Upload Profile Picture");
		customerGetProfilePic.setFont(new Font("Arial", 18));
		Button customerConfirmRegister = new Button("Confirm Registration");
		customerConfirmRegister.setFont(new Font("Arial", 18));
		Button mainMenu = new Button("Main Menu");

		mainMenu.setFont(new Font("Arial", 18));
		mainMenu.setMinSize(100, 50);

		customerGridPane.setVgap(35);
		customerGridPane.setHgap(15);

		customerGridPane.add(customerFirstName, 0, 0);
		customerGridPane.add(customerFirstNameText, 1, 0);
		customerGridPane.add(customerLastName, 0, 1);
		customerGridPane.add(customerLastNameText, 1, 1);
		customerGridPane.add(customerEmail, 0, 2);
		customerGridPane.add(customerEmailText, 1, 2);
		customerGridPane.add(customerPassword, 0, 3);
		customerGridPane.add(customerPasswordText, 1, 3);
		customerGridPane.add(customerStreetAddress, 0, 4);
		customerGridPane.add(customerStreetAddressText, 1, 4);
		customerGridPane.add(customerZipCode, 0, 5);
		customerGridPane.add(customerZipCodeText, 1, 5);

		customerGridPane.setPadding(new Insets(50, 20, 50, 200));
		customerGridPane.setAlignment(Pos.CENTER);
		VBox vBox = new VBox(15);
		vBox.setAlignment(Pos.BOTTOM_CENTER);

		vBox.setPadding(new Insets(35));
		vBox.getChildren().addAll(customerGetProfilePic, customerConfirmRegister);
		HBox hBox = new HBox(15);
		hBox.getChildren().add(mainMenu);
		hBox.setAlignment(Pos.BOTTOM_RIGHT);
		hBox.setPadding(new Insets(50));
		setBottom(hBox);
		setCenter(vBox);
		setLeft(customerGridPane);

	}
}
