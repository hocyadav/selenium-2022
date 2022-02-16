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
/**
 * Hariom Yadav
 * Testing different methods
 */
public class ExcelLibrary2 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\YADHA02\\Downloads\\data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet("Sheet1");
			Iterator<Row> it = s.rowIterator();
			while(it.hasNext()) {
				Row r = it.next();
				Iterator<Cell> it2 = r.cellIterator();
				while(it2.hasNext()) {
					System.out.print(it2.next()+" ");
				}
				System.out.println();
			}
			//Cell c=r.getCell(0);
			
			//String strval=c.getStringCellValue();
			//System.out.println(strval);
			
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
