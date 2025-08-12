package extra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

//		Get the java rep object of the physical file

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\git\\ocmrs\\marriage-registration\\src\\test\\resources\\testData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("matrimony");
		
		Row row = sh.getRow(6);
		
		Cell cell = row.getCell(2);
		
		
		 String value = cell.getStringCellValue();
		 System.out.println(value);
		
		
//		cell.getBooleanCellValue();
//		cell.getNumericCellValue();
//		cell.getLocalDateTimeCellValue();
	}
}
