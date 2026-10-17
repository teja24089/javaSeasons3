package filehandling;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {

		
	FileInputStream fis1=new FileInputStream("C:\\Users\\SDB LAPTOPS\\Documents\\Book1.xlsx");
		
	XSSFWorkbook WB=new XSSFWorkbook(fis1)	;
		
		XSSFSheet WS=WB.getSheet("Sheet1");
		
		int lastrownum=WS.getLastRowNum();
		
		System.out.println("getLastRowNum"+lastrownum);
		
		
		
		int noofrows=WS.getPhysicalNumberOfRows();
		
		System.out.println("getPhysicalNumberOfRows"+noofrows);
		
		XSSFRow row=WS.getRow(0);
		
		
		int lastcellno=row.getLastCellNum();
		
		System.out.println("lastcellno"+lastcellno);
		
		
		int noofcells=row.getPhysicalNumberOfCells();
		
		System.out.println("getPhysicalNumberOfCells"+noofcells);
		
		XSSFCell cell=row.getCell(0);
		
		System.out.println(cell);
		
		System.out.println(cell.getCellType());
		
		
		
		WB.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
