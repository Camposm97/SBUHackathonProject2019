package view;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import model.CustomerAccount;
import util.FXUtil;
import util.ImgUtil;

public class CustomerProfilePage extends GridPane {
	private CustomerAccount cusAcct;
	
	public CustomerProfilePage(CustomerAccount cusAcct) {
		this.cusAcct = cusAcct;
		setPadding(FXUtil.DEFAULT_INSETS);
		setHgap(10);
		setVgap(10);
		setStyle("-fx-font-size: 24;");
		initNodes();
	}
	
	private void initNodes() {
		Label lbl = new Label("Customer Profile Page:");
		lbl.setFont(new Font(32));
		Image image = cusAcct.getImage();
		ImageView iv = new ImageView(image);
		iv.setFitWidth(image.getWidth()*.15);
		iv.setFitHeight(image.getHeight()*.15);
		Label lblFirstName = new Label("First Name: " + cusAcct.getCus().getName().getFirstName());
		Label lblLastName = new Label("Last Name: " + cusAcct.getCus().getName().getLastName());
		Label lblGender = new Label("Gender: " + cusAcct.getCus().getName().getGender());
		add(lbl, 0, 0);
		add(iv, 0, 1);
		add(lblFirstName, 0, 2);
		add(lblLastName, 0, 3);
		add(lblGender, 0, 4);
		add(ImgUtil.loadImgV("bigExit.png"), 5, 0);
	}
	
	public CustomerAccount getCusAcct() {
		return cusAcct;
	}
}
