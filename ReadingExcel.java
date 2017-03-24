package javaStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		File f = new File("F:\\JavaStreams\\myExcelFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheetAt(0);
		/*Row row0 = sheet.getRow(0);
		Cell cellA = row0.getCell(0);
		System.out.println(cellA);*/
		
		System.out.println(workbook.getSheetName(0));
		
		for(Row row : sheet){
			for(Cell cell:row){
				
				switch(cell.getCellType()){
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print("Blank Space");
					break;
				}
			}
			System.out.println();
		}
		
		fis.close();
	}

}
