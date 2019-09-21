package view;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class CompanyProfile extends BorderPane {

	public CompanyProfile() {

		HBox hBoxRoot = new HBox(600);
		HBox hBox1 = new HBox(15);
		HBox hBox2 = new HBox(15);

		Label logoName = new Label("Sample Logo");
		logoName.setFont(new Font("Arial", 26));
		logoName.setTextFill(Color.BLUE);
		hBox1.getChildren().add(logoName);
		hBox1.setPadding(new Insets(15, 15, 15, 70));
		hBox1.setAlignment(Pos.CENTER_LEFT);

		Button searchCustomerOrders = new Button("Find Orders");
		searchCustomerOrders.setFont(new Font("Arial", 18));

		Button messages = new Button("Messages");
		messages.setFont(new Font("Arial", 18));

		Button previousJobs = new Button("Previous Jobs");
		previousJobs.setFont(new Font("Arial", 18));

		hBox2.getChildren().addAll(searchCustomerOrders, messages, previousJobs);
		hBox2.setPadding(new Insets(15));

		hBox2.setAlignment(Pos.CENTER_RIGHT);

		hBoxRoot.getChildren().addAll(hBox1, hBox2);

		VBox vBox = new VBox(20);
		vBox.setPadding(new Insets(60, 20, 20, 50));

		HBox littleBox = new HBox();
		Label littleLable = new Label("Info");
		littleLable.setFont(new Font("Arial", 15));

		ScrollPane testLogo = new ScrollPane();
		testLogo.setMinSize(150, 150);

		Separator sep = new Separator(Orientation.HORIZONTAL);
		sep.setPrefSize(200, 20);

		littleBox.getChildren().addAll(littleLable, sep);
		littleBox.setOpacity(0.5);

		Label address = new Label("Address");
		address.setFont(new Font("Arial", 24));

		Label actualAddress = new Label("123 fake street, \n 11706");

		HBox littleBox2 = new HBox();
		Label littleLabel2 = new Label("Specialties");
		littleLabel2.setFont(new Font("Arial", 15));

		Separator sep2 = new Separator(Orientation.HORIZONTAL);
		sep2.setPrefSize(200, 20);

		Label specialtyDummy1 = new Label("Installing Floors");
		specialtyDummy1.setFont(new Font("Arial", 16));
		Label specialtyDummy2 = new Label("Installing Carpet");
		specialtyDummy2.setFont(new Font("Arial", 16));
		Label specialtyDummy3 = new Label("Installing Roofing");
		specialtyDummy3.setFont(new Font("Arial", 16));

		littleBox2.getChildren().addAll(littleLabel2, sep2);
		littleBox2.setOpacity(0.5);

		vBox.getChildren().addAll(testLogo, littleBox, address, actualAddress, littleBox2, specialtyDummy1,
				specialtyDummy2, specialtyDummy3);
		
		
		Label rating = new Label("Ratings: ");
		rating.setFont(new Font("Arial", 30));
		Image starImage = new Image("usestar.jpg");
		ImageView starView = new ImageView(starImage);
		Label ratingNumber = new Label("10.0");
		ratingNumber.setFont(new Font("Arial", 30));
		starView.setFitWidth(40);
		starView.setFitHeight(40);
		starView.setOpacity(0.5);
		
		HBox starBox = new HBox(5);
		starBox.getChildren().addAll(rating, ratingNumber, starView);
		
		VBox generalInfo = new VBox(20);
		
		Label companyName = new Label("Company Name");
		companyName.setFont(new Font("Arial", 36));
		companyName.setUnderline(true);
		
		HBox imagesOfWork = new HBox(20);
		ScrollPane i1 = new ScrollPane();
		i1.setPrefSize(150, 150);
		ScrollPane i2 = new ScrollPane();
		i2.setPrefSize(150, 150);
		ScrollPane i3 = new ScrollPane();
		i3.setPrefSize(150, 150);
		imagesOfWork.getChildren().addAll(i1, i2, i3);
		
		Label prevWork = new Label("Previous Work");
		prevWork.setFont(new Font("Arial", 22));
		prevWork.setUnderline(true);
		Separator sep3  = new Separator(Orientation.HORIZONTAL);
		sep3.setPrefSize(400, 20);
		generalInfo.getChildren().addAll(companyName, starBox, sep3 ,prevWork,  imagesOfWork);
		
		//generalInfo.getChildren().addAll(companyName, starBox);
		generalInfo.setPadding(new Insets(60, 20, 20 ,20));
		setCenter(generalInfo);
		setLeft(vBox);

		setTop(hBoxRoot);

	}

}
