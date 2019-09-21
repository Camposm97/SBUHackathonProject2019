package app;

import java.util.TreeMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.UserAccount;
import util.DataUtil;
import view.MainPage;

public class App extends Application {
	public static final String TITLE = "Edobu";
	private TreeMap<String, UserAccount> accts;
	
	@Override
	public void init() {
		accts = DataUtil.loadData();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setScene(new Scene(new MainPage()));
		stage.setResizable(false);
		stage.setMaximized(true);
		stage.setTitle(TITLE);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
