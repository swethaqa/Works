package javaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) throws IOException {

		
		//connecting streams
		File f = new File("F:\\JavaStreams\\mynumfile.html");
		//Always rewrite the file when edited
		//FileWriter fw =new FileWriter(f);
		//Always append the file when edited
		FileWriter fw =new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//writing into the file
		
		/*bw.newLine();
		bw.write("Hello");
		bw.newLine();
		bw.write("ChandraSekhar");
		bw.newLine();
		bw.write("Mrudula");
		*/
		
		/*for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				int num = (int)(Math.random()*100);
				bw.write(num + ",");
			}
			bw.newLine();
		}*/
		
		bw.write("<html><body><title>Chandra</title><h1>Welcome to Selenium</h1></body</html");
			
		
		System.out.println("File Created");
		
		bw.close();
		
	}

}
