package org.poreddy.collections.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadData {

	public void Read() {
	
			String input="file.txt";
			String output="destFile.txt";
		
		BufferedReader br = null;
		File file = null;
		try {
			file = new File(output);
			br = new BufferedReader(new FileReader(input));

			BufferedWriter bw = new BufferedWriter(new FileWriter(
					file.getAbsoluteFile()));
			String inputLine;
			while ((inputLine = br.readLine()) != null) {
				bw.write(inputLine+"\n");
				System.out.print(inputLine);
			}
			bw.close();

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
	

}
