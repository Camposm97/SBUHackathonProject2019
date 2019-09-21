package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

@Deprecated
public class RegistrationChooserPage extends BorderPane{

	public RegistrationChooserPage() {
		
		Button selectCustomer = new Button("Customer");
		Button selectCompany = new Button("Company");
		
		
		setPadding(new Insets(15,50 ,50,15));
		
		selectCustomer.setMinSize(200, 100);
	
		selectCompany.setMinSize(200, 100);
		
		HBox botBox = new HBox(15);
		Button mainMenu = new Button("Main Menu");
		mainMenu.setMinSize(100, 50);
		
		botBox.getChildren().addAll(mainMenu);
		botBox.setAlignment(Pos.BASELINE_RIGHT);
		setBottom(botBox);
		
		
		HBox hBox = new HBox(15);
		hBox.getChildren().addAll(selectCompany, selectCustomer);
		hBox.setAlignment(Pos.CENTER);
		setCenter(hBox);
	}
	
}
