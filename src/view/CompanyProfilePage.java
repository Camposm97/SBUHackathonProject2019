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
import model.CompanyAccount;
import util.FXUtil;
import util.ImgUtil;

public class CompanyProfilePage extends BorderPane {
	private CompanyAccount coAcct;

	public CompanyProfilePage(CompanyAccount coAcct) {
		this.coAcct = coAcct;
		initNodes();
	}

	private void initNodes() {
		HBox hBoxRoot = new HBox(600);
		HBox hBox1 = new HBox(15);

		Label logoName = new Label("Logo Goes Here");
		logoName.setFont(new Font("Arial", 26));
		logoName.setTextFill(Color.BLUE);
		hBox1.getChildren().add(logoName);
		hBox1.setPadding(new Insets(15, 15, 15, 70));
		hBox1.setAlignment(Pos.CENTER_LEFT);

		hBoxRoot.getChildren().addAll(hBox1);

		VBox vBox = new VBox(20);
		vBox.setPadding(new Insets(60, 20, 20, 50));

		HBox littleBox = new HBox();
		Label lblLittle = new Label("Info");
		lblLittle.setFont(new Font("Arial", 15));

		Image img = ImgUtil.loadImg("images/" + coAcct.getImageUrl());
		ImageView ivLogo = ImgUtil.loadQImgV(img);

		Separator sep = new Separator(Orientation.HORIZONTAL);
		sep.setPrefSize(200, 20);

		littleBox.getChildren().addAll(lblLittle, sep);
		littleBox.setOpacity(0.5);

		Label lblAddress1 = new Label("Address");
		lblAddress1.setFont(new Font("Arial", 24));

		Label lblAddress2 = new Label("123 Some Street, \n 11706");

		HBox littleBox2 = new HBox();
		Label littleLabel2 = new Label("Specialties");
		littleLabel2.setFont(new Font("Arial", 15));

		Separator sep2 = new Separator(Orientation.HORIZONTAL);
		sep2.setPrefSize(200, 20);

		Label lbl1 = new Label("Installing Floors");
		lbl1.setFont(new Font("Arial", 16));
		Label lbl2 = new Label("Installing Carpet");
		lbl2.setFont(new Font("Arial", 16));
		Label lbl3 = new Label("Installing Roofing");
		lbl3.setFont(new Font("Arial", 16));

		littleBox2.getChildren().addAll(littleLabel2, sep2);
		littleBox2.setOpacity(0.5);

		vBox.getChildren().addAll(ivLogo, littleBox, lblAddress1, lblAddress2, littleBox2, lbl1,
				lbl2, lbl3);

		Label rating = new Label("Ratings: ");
		rating.setFont(new Font("Arial", 30));
		Image starImage = ImgUtil.loadImg("images/usestar.jpg");
		ImageView starView = new ImageView(starImage);
		Label ratingNumber = new Label("10.0");
		ratingNumber.setFont(new Font("Arial", 30));
		starView.setFitWidth(40);
		starView.setFitHeight(40);
		starView.setOpacity(0.5);

		HBox starBox = new HBox(5);
		starBox.getChildren().addAll(rating, ratingNumber, starView);

		VBox generalInfo = new VBox(20);

		Label lblCoName = new Label(coAcct.getC().getName());
		lblCoName.setFont(new Font("Arial", 36));
		lblCoName.setUnderline(true);

		Label prevWork = new Label("Previous Work");
		prevWork.setFont(new Font("Arial", 22));
		prevWork.setUnderline(true);
		Separator sep3 = new Separator(Orientation.HORIZONTAL);
		sep3.setPrefSize(400, 20);
		generalInfo.getChildren().addAll(lblCoName, starBox, sep3, prevWork, loadPrevWork());

		generalInfo.setPadding(new Insets(60, 20, 20, 20));
		setCenter(generalInfo);
		setLeft(vBox);
		setRight(loadBtnBox());
		setTop(hBoxRoot);
	}
	
	public HBox loadPrevWork() {
		HBox hBox = new HBox(10);
		ImageView iv1, iv2, iv3;
		iv1 = ImgUtil.loadQImgV(ImgUtil.loadImg("images/works/1.png"));
		iv2 = ImgUtil.loadQImgV(ImgUtil.loadImg("images/works/2.png"));
		iv3 = ImgUtil.loadQImgV(ImgUtil.loadImg("images/works/3.png"));
		hBox.getChildren().addAll(iv1, iv2, iv3);
		return hBox;
	}

	public VBox loadBtnBox() {
		Button btSearch = new Button("Find Orders"); // Search Customer Orders
		btSearch.setPrefWidth(FXUtil.BTN_WIDTH);
		btSearch.setOnAction(e -> {
			
		});
		btSearch.setFont(new Font(18));

		Button btMessages = new Button("Messages"); // Only display
		btMessages.setPrefWidth(FXUtil.BTN_WIDTH);
		btMessages.setOnAction(e -> {
			
		});
		btMessages.setFont(new Font(18));

		Button btPrev = new Button("Previous Jobs"); // Order Request History
		btPrev.setPrefWidth(FXUtil.BTN_WIDTH);
		btPrev.setOnAction(e -> {
			
		});
		btPrev.setFont(new Font(18));

		VBox vBox = FXUtil.loadVBox(btSearch, btMessages, btPrev);
		vBox.setPadding(FXUtil.DEFAULT_INSETS);
		return vBox;
	}
}
