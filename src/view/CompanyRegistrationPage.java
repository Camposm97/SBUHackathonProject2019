package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class CompanyRegistrationPage extends BorderPane {

	public CompanyRegistrationPage() {

		Label companyName = new Label("Company Name: ");
		companyName.setTextFill(Color.BLACK);
		companyName.setFont( new Font( "Arial",  24 ) );
		Label companyAddress = new Label("Company Address: ");
		companyAddress.setTextFill(Color.BLACK);
		companyAddress.setFont( new Font( "Arial",  24 ) );
		Label companyLicense = new Label("Contractor Lisence #: ");
		companyLicense.setTextFill(Color.BLACK);
		companyLicense.setFont( new Font( "Arial",  24 ) );
		Label companySpecialty = new Label("Specialty: ");
		companySpecialty.setTextFill(Color.BLACK);
		companySpecialty.setFont( new Font( "Arial",  24 ) );
		Label companyYears = new Label("Years in Business: ");
		companyYears.setTextFill(Color.BLACK);
		companyYears.setFont( new Font( "Arial",  24 ) );

		TextField companyNameText = new TextField();
		TextField companyAddressText = new TextField();
		TextField companyLicenseText = new TextField();
		TextField companySpecialtyText = new TextField();
		TextField companyYearsText = new TextField();
		
		
		Button mainMenu = new Button("Main Menu");
		mainMenu.setFont(new Font("Arial", 18));
		mainMenu.setMinSize(100, 50);
		HBox hBox = new HBox(15);
		hBox.setPadding(new Insets(50));
		hBox.getChildren().add(mainMenu);
		hBox.setAlignment(Pos.BASELINE_RIGHT);
		
		
		VBox vBox = new VBox(15);
		Button confirmRegister = new Button("Confirm Registration");
		Button chooseLogo = new Button("Upload Company Logo");
		chooseLogo.setFont(new Font("Arial", 18));
		confirmRegister.setFont(new Font("Arial", 18));
		vBox.getChildren().addAll(chooseLogo, confirmRegister);
		vBox.setAlignment(Pos.BOTTOM_CENTER);
		
		GridPane companyPane = new GridPane();
		companyPane.add(companyName, 0, 0);
		companyPane.add(companyNameText, 1, 0);
		companyPane.add(companyAddress, 0, 1);
		companyPane.add(companyAddressText, 1, 1);
		companyPane.add(companyLicense, 0, 2);
		companyPane.add(companyLicenseText, 1, 2);
		companyPane.add(companySpecialty, 0, 3);
		companyPane.add(companySpecialtyText, 1, 3);
		companyPane.add(companyYears, 0, 4);
		companyPane.add(companyYearsText, 1, 4);
		
		companyPane.setVgap(35);
		companyPane.setPadding(new Insets(50,20,50,200));
		
		companyPane.setAlignment(Pos.CENTER);
		setCenter(vBox);
		setBottom(hBox);
		setLeft(companyPane);
		
	}

}
