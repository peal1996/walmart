package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class ReadExcelFile {
	
	 public static Object[][] readExcel() throws Exception {
		 FileInputStream f=new FileInputStream(new File("C:\\Users\\peal9\\Documents\\excelfileReaad.xlsx"));

		 XSSFWorkbook x=new XSSFWorkbook(f);
		 XSSFSheet sheet=x.getSheetAt(0);
		 int rowNum=sheet.getLastRowNum();
		 System.out.println(rowNum);
		 int celNum=sheet.getRow(0).getLastCellNum();
		 System.out.println(celNum);
		 Object[][] datas=new Object[rowNum][celNum];

		 for(int i=1;i<=rowNum;i++)
		 {
		 for(int j=0;j<celNum;j++)
		 {
		 XSSFCell cell=sheet.getRow(i).getCell(j);
		 if(cell.getCellType()== CellType.STRING )
		 {
		 //System.out.println(cell.getStringCellValue());
		 datas[i-1][j]=cell.getStringCellValue();

		 }
		 else if(cell.getCellType()==CellType.NUMERIC)
		 {
		 System.out.println(cell.getNumericCellValue());
		 datas[i-1][j]=(int)cell.getNumericCellValue();

		 }
		 }
		 }
		 return datas;
	 }
}
