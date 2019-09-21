package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Customer;
import model.CustomerAccount;
import model.Gender;
import model.Name;
import view.CustomerViewer;

/**
 * Don't play this Demo lul
 * @author Camposm97
 */
public class DemoCutomerViewer extends Application {
	@Override
	public void start(Stage stage) {
		Name name = new Name("Michael", "Campos", Gender.Male);
		Customer cus = new Customer(name);
		CustomerAccount cusAcct = new CustomerAccount("1", "1", cus);
		stage.setScene(new Scene( new CustomerViewer(cusAcct)));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
