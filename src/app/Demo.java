package app;

import java.util.TreeMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.UserAccount;
import view.MainPage;

public class Demo extends Application {
	public static final String APP_TITLE = "";
	private TreeMap<UserAccount, String> userAccounts;
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setScene(new Scene(new MainPage()));
		stage.setResizable(false);
		stage.setMaximized(true);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
