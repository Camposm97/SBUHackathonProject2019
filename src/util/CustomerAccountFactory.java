package util;

import java.io.FileNotFoundException;

public class CustomerAccountFactory {
	private NameFactory nameFactory;
	
	public CustomerAccountFactory() throws FileNotFoundException {
		nameFactory = new NameFactory();
	}
}
