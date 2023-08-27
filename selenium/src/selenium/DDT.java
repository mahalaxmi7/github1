package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT {
	
 public static void main(String[] args) throws IOException,EncryptedDocumentException 
 {
	FileInputStream fis=new FileInputStream("./EXCEL/testdata.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("sheet1");
	Row r=sh.getRow(0);
	Cell cel=r.getCell(0);
	String value=cel.toString();
	System.out.println(value);	
}
	
}

