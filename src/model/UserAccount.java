package model;

import javafx.scene.image.Image;

public abstract class UserAccount {
	private String username;
	private String password;
	private String imageUrl;

	public UserAccount(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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
