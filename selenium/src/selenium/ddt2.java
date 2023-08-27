package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ddt2 {
	public static void main(String[] arg) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./EXCEL/testdata.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sheet1");
		Row r=sh.createRow(0);
		Cell cel=r.createCell(0);
		cel.setCellValue("rajajinagar");
		FileOutputStream fout=new FileOutputStream("./EXCEL/testdata.xlsx");
		book.write(fout);
	}

}
