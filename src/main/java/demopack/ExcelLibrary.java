package demopack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\YADHA02\\Downloads\\data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet("Sheet1");
			Row r = s.getRow(0);
			
			Cell c=r.getCell(0);
			
			String strval=c.getStringCellValue();
			System.out.println(strval);
			
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

	}

}
