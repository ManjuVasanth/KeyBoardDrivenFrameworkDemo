package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// Logic to read excel file
public class ExcelUtilities {
	XSSFWorkbook workBook;
	XSSFSheet sheet;
	XSSFCell cell;
	FileInputStream file;
	public static int totalRows;
	public static String locatorColumnValue;
	public static String locatorName;
	public static String locatorValue;
	public static String keywordColumnValue; 
	public static String dataColumnValue;
	
	//location = "src\\test\\resources\\TestDataCore.xlsx"
	public void readExcelFile(String location) throws Exception {
		//file location
		
			 file = new FileInputStream(location);
			workBook = new XSSFWorkbook(file);
			sheet = workBook.getSheet("Sheet2");
			totalRows= sheet.getLastRowNum();
	}
	//public String getValuesFromExcel(int row, int column) {
	public void getLocatorsKeywordsData(int row,int locatorColumn,int keywordColumn,int dataColumn) {

		//cell = sheet.getRow(row).getCell(column);
		//String cellValue = cell.getStringCellValue();
		locatorColumnValue =sheet.getRow(row).getCell(locatorColumn).toString().trim();
		System.out.println(locatorColumnValue);
		if(!locatorColumnValue.contains("NA")) {
		locatorName =locatorColumnValue.split("=")[0].toString().trim(); 
		locatorValue =locatorColumnValue.split("=")[1].toString().trim(); 
	}else {
		locatorName ="NA";
		locatorValue ="NA";
	}
		keywordColumnValue = sheet.getRow(row).getCell(keywordColumn).toString().trim();
		dataColumnValue = sheet.getRow(row).getCell(dataColumn).toString().trim();
		System.out.println(locatorName+":"+locatorValue+"Keyword: "+keywordColumn + "Data:"+dataColumnValue);
		
		}
}


