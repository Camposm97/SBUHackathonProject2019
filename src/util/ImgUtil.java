package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImgUtil {
	public static Image loadImg(String url) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File(url));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return new Image(fis);
	}
	
	public static ImageView loadHalfImgV(Image img) {
		ImageView iv = new ImageView(img);
		iv.setFitWidth(img.getWidth() * 0.25);
		iv.setFitHeight(img.getHeight() * 0.25);
		return iv;
	}

	public static ImageView loadImgV(String url) {
		return new ImageView(loadImg(url));
	}
}
