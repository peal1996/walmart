package allPagesTest;

import org.testng.annotations.DataProvider;

public class DataproviderClass {
	
	@DataProvider(name="search")
	public String[][] data() {
		String[][] s = {  {"Jeans"}, {"Coat"}};
		
		return s;
	}

}
