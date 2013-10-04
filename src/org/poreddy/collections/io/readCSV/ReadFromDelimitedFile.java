package org.poreddy.collections.io.readCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReadFromDelimitedFile {

	public ReadFromDelimitedFile(String inputFile, String aDelimitor) {
		BufferedReader readFromCSV = null;

		try {
			readFromCSV = new BufferedReader(new FileReader(inputFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String catchLine = null;
		Map aCSVonMap = new HashMap();
		try {
			while ((catchLine = readFromCSV.readLine()) != null) {
				String[] strArray = catchLine.split(aDelimitor);
				if(strArray.length>=2)
				aCSVonMap.put(strArray[0], strArray[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		displayMap(aCSVonMap);
	}

	private void displayMap(Map aCSVonMap) {
		Iterator mapIterator = aCSVonMap.entrySet().iterator();
		while (mapIterator.hasNext()) {
			System.out.println(mapIterator.next());
		}
	}
}
