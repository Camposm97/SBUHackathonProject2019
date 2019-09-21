package model;

import javafx.scene.image.Image;

public abstract class UserAccount {
	private String imageUrl;
	
	protected Image getImage() {
		return new Image(imageUrl);
	}
	
	protected void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	protected String getImageUrl(String imageUrl) {
		return imageUrl;
	}
}	
