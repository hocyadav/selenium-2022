package demopack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenFrameWork {

	public String getExcelData(String sheetname , int rownum , int cellnum){
	 String retval=null;
	 
	
	try {
		FileInputStream fis = new FileInputStream("C:\\Users\\YADHA02\\Downloads\\data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s= wb.getSheet(sheetname);
		Row r=s.getRow(rownum);
		Cell c=r.getCell(cellnum);
		retval=c.getStringCellValue();
		
	} catch (FileNotFoundException e) {
			e.printStackTrace();
	} catch (EncryptedDocumentException e) {
			e.printStackTrace();
	} catch (IOException e) {
			e.printStackTrace();
	}
	
	 
	return retval;

	}
	
	public int lastrownum(String sheetname)
	{
		int retval=0;
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\YADHA02\\Downloads\\data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetname);
			retval=s.getLastRowNum();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retval;
		
				
	}


}

 
 
 