package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.TreeMap;

import app.App;
import model.UserAccount;

public class DataUtil {
	private static final int SIZE = 10;
	public static final File FILE_ACCTS = new File("data/accounts.dat");
	
	public static void main(String[] args) {
		emitData();
	}
	
	public static TreeMap<String, UserAccount> loadData() {
		TreeMap<String, UserAccount> accts = new TreeMap<>();
		return accts;
	}

	public static void saveData(File file, Object o) {
		try {
			FileOutputStream fis = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(o);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void saveDataMap() {
		saveData(FILE_ACCTS, App.accts);
	}
	
	/**
	 * Generated random accounts and saves as a .dat file
	 */
	public static void emitData() {
		TreeMap<String, UserAccount> map = new TreeMap<>();
		try {
			UserAccountFactory acctFactory = new UserAccountFactory();
			for (int i = 0; i < SIZE; i++) {
				UserAccount acct = acctFactory.emitAcct();
				map.put(acct.getUsername(), acct);
			}
			App.accts = map;
			saveDataMap();
			System.out.println(map.toString());
			System.out.println("Successfully generated accounts and saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
