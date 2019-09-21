package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import model.CustomerAccount;
import util.FXUtil;
import util.ImgUtil;

public class CustomerProfilePage extends BorderPane {
	private CustomerAccount cusAcct;
	
	public CustomerProfilePage(CustomerAccount cusAcct) {
		this.cusAcct = cusAcct;
		setPadding(FXUtil.DEFAULT_INSETS);
		setStyle("-fx-font-size: 24;");
		initNodes();
	}
	
	private void initNodes() {
		GridPane gridPane = new GridPane();
		Label lbl = new Label("Customer Profile Page:");
		lbl.setFont(new Font(32));
		Image image = ImgUtil.loadImg("images/" + cusAcct.getImageUrl());
		ImageView iv = new ImageView(image);
		iv.setFitWidth(image.getWidth()*.15);
		iv.setFitHeight(image.getHeight()*.15);
		Label lblFirstName = new Label("First Name: " + cusAcct.getCus().getName().getFirstName());
		Label lblLastName = new Label("Last Name: " + cusAcct.getCus().getName().getLastName());
		Label lblGender = new Label("Gender: " + cusAcct.getCus().getName().getGender());
		gridPane.add(lbl, 0, 0);
		gridPane.add(iv, 0, 1);
		gridPane.add(lblFirstName, 0, 2);
		gridPane.add(lblLastName, 0, 3);
		gridPane.add(lblGender, 0, 4);
		ImageView iv1 = ImgUtil.loadImgV("images/exitBig.png");
		iv1.setOnMouseClicked(e -> {
			Scene scene = this.getScene();
			scene.setRoot(new CustomerLoginPage());
		});
		StackPane stackPane = new StackPane(iv1);
		stackPane.setAlignment(Pos.TOP_RIGHT);
		setRight(stackPane);
		setCenter(gridPane);
	}
	
	public CustomerAccount getCusAcct() {
		return cusAcct;
	}
}
