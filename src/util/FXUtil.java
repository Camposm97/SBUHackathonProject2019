package util;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXUtil {
	public static final Insets DEFAULT_INSETS = new Insets(10);
	
	public static VBox loadVBox(Node...nodes) {
		VBox vBox = new VBox(10);
		for (Node n : nodes)
			vBox.getChildren().add(n);
		return vBox;
	}
	
	public static HBox loadHBox(Node...nodes) {
		HBox hBox = new HBox(10);
		for (Node n : nodes)
			hBox.getChildren().add(n);
		return hBox;
	}
	
	public static <T> ComboBox<T> loadCb(T[] arr) {
		ComboBox<T> cb = new ComboBox<>();
		for (T elem : arr)
			cb.getItems().add(elem);
		return cb;
	}
}
