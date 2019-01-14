package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderMethods {
	
	@DataProvider(name="FILE_NAME")
	public Object [][] createAccount() throws Exception{
	
		return ReadExcelFile.readExcel();
		
	}
	
	
	
	
	

}
