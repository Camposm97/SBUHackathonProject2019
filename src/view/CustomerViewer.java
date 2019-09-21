package view;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import model.CustomerAccount;
import util.FXUtil;

public class CustomerViewer extends GridPane {
	private CustomerAccount cusAcct;
	
	public CustomerViewer(CustomerAccount cusAcct) {
		this.cusAcct = cusAcct;
		setPadding(FXUtil.DEFAULT_INSETS);
		Label lbl = new Label("Customer Viewer: ");
		lbl.setFont(Font.font(24));
		Label lblFirstName = new Label("First Name: " + cusAcct.getCus().getName().getFirstName());
		Label lblLastName = new Label("Last Name: " + cusAcct.getCus().getName().getLastName());
		Label lblGender = new Label("Gender: " + cusAcct.getCus().getName().getGender());
		add(lbl, 0, 0);
		add(lblFirstName, 0, 1);
		add(lblLastName, 0, 2);
		add(lblGender, 0, 3);
		
	}
	
	public CustomerAccount getCusAcct() {
		return cusAcct;
	}
}
