package pageobjectmodel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Flib {
	public String readExcelData(String excelPath,String sheetName,int rowCont,int cellCount) throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream(excelPath);
	}

}
