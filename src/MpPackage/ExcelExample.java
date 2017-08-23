package MpPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Create an object of File class to open xls file
		String filePath ="C:\\Sanjeev\\myExcel.xls"; 
		File inputFile = new File(filePath);
		
		//Create an object of FileInputStream class to read excel file
		FileInputStream fi = new FileInputStream(inputFile);
		//Workbook wb = new HSSFWorkbook(inputStream);
	}

}
