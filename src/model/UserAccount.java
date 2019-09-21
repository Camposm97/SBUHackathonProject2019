package model;

import java.io.Serializable;

import javafx.scene.image.Image;

@SuppressWarnings("serial")
public abstract class UserAccount implements Serializable {
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

	public Image getImage() {
		return new Image(imageUrl);
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(String imageUrl) {
		return imageUrl;
	}

	@Override
	public String toString() {
		return "UserAccount [username=" + username + ", password=" + password + "]";
	}
}
