package samplePackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleExcelOpen {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\SeleniumFolder/sheet1.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sheet1");
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(1).getCell(4));
		System.out.println(value);
	}

}
