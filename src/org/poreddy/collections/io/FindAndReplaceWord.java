package org.poreddy.collections.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FindAndReplaceWord {

	final String TSI = "Company";

	public void replace(String inputFile) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(inputFile));

			String inputLine, outBuf = "";
			while ((inputLine = br.readLine()) != null) {
				outBuf = outBuf + inputLine.replaceAll("TSI", TSI) + "\r\n";
			}
			br.close();
			bw = new BufferedWriter(new FileWriter(inputFile));
			bw.write(outBuf);
			bw.flush();
			bw.close();
			System.out.println(outBuf);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
