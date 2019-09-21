package view;


import control.ColorButton;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import util.ImgUtil;

public class MainPage extends BorderPane {
	private static final Font BIG_FONT = Font.font(48);
	public MainPage() {
		
		BorderPane bp = new BorderPane();
		Label lblWho = new Label("Edobu");
		lblWho.setFont(BIG_FONT);
	
		Label lblQues = new Label("Select your Login Option");
		lblQues.setFont(new Font("Arial", 35));
		lblQues.setTextFill(Color.BLACK);
		
		Image houseImg = ImgUtil.loadImg("images/contemporary.jpg");
		ImageView houseView = new ImageView(houseImg);
		houseView.resize(64, 64);
		VBox vBox = new VBox(20);
		Button registrationBtn = new Button("Register");
		registrationBtn.setFont(new Font("Arial", 30));
		
		
		HBox hBox = new HBox(55);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(loadBtCus(), loadBtCo());
		
		
		Image userRegisterImage = ImgUtil.loadImg("images/testgui.jpg");
		
		
		ImageView userRegisterLogo = new ImageView(userRegisterImage);
		userRegisterLogo.setFitWidth(1300);
		userRegisterLogo.setFitHeight(700);

		vBox.getChildren().addAll(lblWho, houseView,lblQues,hBox, registrationBtn);
		vBox.setAlignment(Pos.CENTER);
		StackPane stackPaneReg = new StackPane();
		stackPaneReg.getChildren().addAll(userRegisterLogo, vBox);

		HBox userRegHBox = new HBox();
		userRegHBox.getChildren().add(stackPaneReg);
		
		FlowPane fp = new FlowPane();
		fp.getChildren().add(userRegHBox);
		setCenter(fp);
		registrationBtn.setOnAction(e -> {
			Scene scene = this.getScene();
			scene.setRoot(new CustomerRegistrationPage());
		});

		
	}
	
	private Button loadBtCus() {
		Button bt = new ColorButton("Customer", Color.BLUE);
		bt.setFont(new Font("Arial", 30));
		bt.setOnAction(e -> {
			Scene scene = this.getScene();
			scene.setRoot(new CustomerLoginPage());
		});

	

		return bt;
	}
	
	private Button loadBtCo() {
		Button bt = new ColorButton("Company", Color.BLUE);
		bt.setFont(new Font("Arial", 30));
		bt.setOnAction(e -> {
			Scene scene = this.getScene();
			scene.setRoot(new CompanyLoginPage());
		});
	
	
		return bt;
	}
}
