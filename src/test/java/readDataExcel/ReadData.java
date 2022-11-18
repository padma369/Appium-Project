package readDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("./testData/RegistrationData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//workbook.getSheetAt(0);			//index

//		int rowsCount = workbook.getSheet("smokeTest").getLastRowNum();
//		
//		System.out.println("No. of rows: " + rowsCount);
		
		
		
		XSSFSheet sheet = workbook.getSheet("smokeTest");
		
		int rowCount = sheet.getLastRowNum();
		int rowFirst = sheet.getFirstRowNum();
		
		int count = rowCount - rowFirst;
		
		System.out.println("ROws Count - RowFirst: count----: " + rowCount + " - " + rowFirst + " : " +count);
		System.out.println("No. of rows: " + rowCount);
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("No. of Columns: " + columnCount);
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			XSSFRow currentRow = sheet.getRow(i);
			
//			for (int j = 0; j < columnCount; j++) {
//				
//				String value = sheet.getRow(i).getCell(j).toString();
//				System.out.println("Value: " + i + " : " + value);
//				System.out.println("-------------------------------");
//				
//			}
//			
//			System.out.println("--------------"+ i + "-----------------");
			
			
			String fName = currentRow.getCell(0).toString();
			String lName = currentRow.getCell(1).toString();
			String email = currentRow.getCell(2).toString();
			String phone = currentRow.getCell(3).toString();
			String address = currentRow.getCell(4).toString();
			
			System.out.println("FirstName: " + fName);
			System.out.println("Address: " + address);
			System.out.println("====================================");
			
		}
		
		
		
		
	}

}
