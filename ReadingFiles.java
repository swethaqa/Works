package javaStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {
		
		File f = new File("F:\\JavaStreams\\myTextfile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		while((line = br.readLine())!=null){
		
		System.out.println(line);
		
		}
		br.close();
	}
	
}
