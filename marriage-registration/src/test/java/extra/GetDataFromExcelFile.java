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
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\git\\ocmrs\\marriage-registration\\src\\test\\resources\\testData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
//		Wife Photo	wife Address	Wife Religion	Wife DOB	Wife Marital Status	Wife Zipcode	Wife State	Wife Aadhaar		Witness 1 Name	Witness 1 Address		Witness 2 Name	Witness 2 Address		Witness 3 Name	Witness 3 Address

		String husName = wb.getSheet("matrimony").getRow(1).getCell(2).getStringCellValue();
		String HusbandPhoto = wb.getSheet("matrimony").getRow(1).getCell(3).getStringCellValue();
		String HusbandAddress = wb.getSheet("matrimony").getRow(1).getCell(4).getStringCellValue();
		String HusbandReligion = wb.getSheet("matrimony").getRow(1).getCell(5).getStringCellValue();
//		String HusbandDOB = wb.getSheet("matrimony").getRow(1).getCell(6).getStringCellValue();
		String HusbandMaritalStatus = wb.getSheet("matrimony").getRow(1).getCell(7).getStringCellValue();
//		String HusbandZipcode = wb.getSheet("matrimony").getRow(1).getCell(8).getStringCellValue();
		String HusbandState = wb.getSheet("matrimony").getRow(1).getCell(9).getStringCellValue();
//		String HusbandAadhaar = wb.getSheet("matrimony").getRow(1).getCell(10).getStringCellValue();
		
		String wifeName = wb.getSheet("matrimony").getRow(1).getCell(12).getStringCellValue();
		String wifePhoto = wb.getSheet("matrimony").getRow(1).getCell(13).getStringCellValue();
		String wifeAddress = wb.getSheet("matrimony").getRow(1).getCell(14).getStringCellValue();
		String wifeReligion = wb.getSheet("matrimony").getRow(1).getCell(15).getStringCellValue();
//		String wifeDOB = wb.getSheet("matrimony").getRow(1).getCell(16).getStringCellValue();
		String wifeMaritalStatus = wb.getSheet("matrimony").getRow(1).getCell(17).getStringCellValue();
//		String wifeZipcode = wb.getSheet("matrimony").getRow(1).getCell(18).getStringCellValue();
		String wifeState = wb.getSheet("matrimony").getRow(1).getCell(19).getStringCellValue();
//		String wifeAadhaar = wb.getSheet("matrimony").getRow(1).getCell(20).getStringCellValue();
		
		System.out.println(HusbandAddress);
	}
}
