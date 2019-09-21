package view;


import control.ColorButton;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MainPage extends BorderPane {
	private static final Font BIG_FONT = Font.font(48);
	public MainPage() {
		Label lblWho = new Label("WHO ARE YOU?!");
		lblWho.setFont(BIG_FONT);
		setTop(new StackPane(lblWho));
		HBox hBox = new HBox();
		hBox.getChildren().addAll(loadBtCus(), loadBtCo());
		setCenter(hBox);
	}
	
	private Button loadBtCus() {
		Button bt = new ColorButton("I am Customer!", Color.BLUE);
		bt.setOnAction(e -> {
			// Change to Customer Login/SignUp Pane
			Scene scene = this.getScene();
			scene.setRoot(new CustomerLoginPage());
		});

		bt.prefWidthProperty().bind(this.widthProperty().divide(2));
		bt.prefHeightProperty().bind(this.heightProperty());
		bt.setFont(BIG_FONT);
		return bt;
	}
	
	private Button loadBtCo() {
		Button bt = new ColorButton("I am Company!", Color.BLUE);
		bt.setOnAction(e -> {
			// Change to Company Login/Signup Pane
		});
		bt.prefWidthProperty().bind(this.widthProperty().divide(2));
		bt.prefHeightProperty().bind(this.heightProperty());
		bt.setFont(BIG_FONT);
		return bt;
	}
}
