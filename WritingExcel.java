package javaStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("firstshet");
		/*Row row0 = sheet0.createRow(0);
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("first cell");
		cellB.setCellValue("second cell");*/
		
		for (int rows =0;rows<10;rows++){
			
			Row row = sheet0.createRow(rows);
			for(int cells =0;cells<10;cells++){
			 Cell cell = row.createCell(cells);
			 cell.setCellValue((int)(Math.random()*100));
			}
		}
		
		
		
		File f = new File("F:\\JavaStreams\\myExcelFile.xlsx");
		FileOutputStream fs = new FileOutputStream(f);
		
		workbook.write(fs);
		
		fs.close();
		
		System.out.println("File Created");
		
		
		
	}

}
