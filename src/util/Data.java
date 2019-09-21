package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.TreeMap;

import app.App;
import model.UserAccount;
import util.factory.UserAccountFactory;

public class Data {
	private static final int SIZE = 10;
	public static final File FILE_ACCTS = new File("data/accounts.dat");
	
	// Run this is generated new data for accounts
	public static void main(String[] args) {
		emitData();
	}
	
	@SuppressWarnings("unchecked")
	public static TreeMap<String, UserAccount> loadDataMap() {
		TreeMap<String, UserAccount> accts = null;
		try {
			accts = (TreeMap<String, UserAccount>) loadData(FILE_ACCTS);
			Set<String> set = accts.keySet();
			for (String s : set) {
				UserAccount acct = accts.get(s);
				System.out.println(acct);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accts;
	}
	
	public static Object loadData(File file) {
		Object o = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			o = ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return o;
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
