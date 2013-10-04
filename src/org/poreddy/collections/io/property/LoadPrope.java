package org.poreddy.collections.io.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class LoadPrope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(new File("prop.properties")));
			Set set= properties.entrySet();
			Iterator ir = set.iterator();
			while(ir.hasNext())
			System.out.println(ir.next());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
