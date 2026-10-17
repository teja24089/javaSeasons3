package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException, FileNotFoundException {

	FileInputStream fis1=new FileInputStream("C:\\Users\\SDB LAPTOPS\\Documents\\Book1.xlsx");	
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws=wb.getSheet("sheet1");
		
ws.createRow(3).createCell(0).setCellValue("rest assured");
	

FileOutputStream fos=new FileOutputStream("C:\\Users\\SDB LAPTOPS\\Documents\\Book1.xlsx");


wb.write(fos);
	
		
		
	wb.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
		
		
}	
		
		
		
	


