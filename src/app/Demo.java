package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.CompanyProfile;
import view.CompanyRegistrationPage;
import view.CustomerLoginPage;
import view.CustomerRegistrationPage;
import view.RegistrationChooserPage;

public class Demo extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		
		RegistrationChooserPage registerChoosePage = new RegistrationChooserPage();
		CustomerRegistrationPage registerPage = new CustomerRegistrationPage();
		CompanyRegistrationPage companyreg = new CompanyRegistrationPage();
		CustomerLoginPage custlog = new CustomerLoginPage();
		CompanyProfile companyProfile = new CompanyProfile();
		
		Scene scene = new Scene(companyProfile);
		stage.setMaximized(true);
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
