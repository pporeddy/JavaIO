package org.poreddy.collections.io.property;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties property = new Properties();

		property.setProperty("Dbusername", "root");
		property.setProperty("Dbpassword", "password");
		property.setProperty("Dbname", "localhost");
		property.setProperty("Port", "2023");

		try {
			//Property.save is @deprecated.
			property.store(new FileOutputStream("prop.properties"), null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
