package org.poreddy.collections.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FindAndReplace {
	
	final String TSI = "New Company";
	
	public void replace(String inputFile) {
		BufferedWriter bw = null;
			File file = new File("tsi.txt");
			if(file.exists())
				System.out.println("File Exists");
		try {
			String content = new String(Files.readAllBytes(Paths.get("tsi.txt")), StandardCharsets.UTF_8);
			content=content.replaceAll("TSI", TSI);
			bw = new BufferedWriter(new FileWriter(new File("tsi.txt")));
			bw.write(content);
			bw.flush();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
