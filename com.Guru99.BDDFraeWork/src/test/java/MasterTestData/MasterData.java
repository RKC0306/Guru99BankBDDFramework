package MasterTestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MasterData 
{
	//public static String EXCEL_FILE_LOC = "C:\\Work\\eclipse-workspace\\com.Guru99.BD\\GuruBankCustomerDetails.xlsx";
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	
		
	public static void loadExcel(String FilePath) throws IOException
	{
		File file = new File(FilePath);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Sheet1");
		fis.close();		
	}
	
	
	public static List<Map<String, String>> readAllData(String FilePath) throws IOException
	{
		if(sheet==null)
		{
			loadExcel(FilePath);
		}
		
		List<Map<String,String>> mapLists = new ArrayList<Map<String, String>>();
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		row = sheet.getRow(0);
		for(int j = 1; j<row.getLastCellNum(); j++)
		{
			Map<String, String> myMap = new HashMap<String, String>();
			for(int i = 0; i<rows; i++)
			{
				Row r = CellUtil.getRow(i, sheet);
				String key = CellUtil.getCell(r, 0).getStringCellValue();
				String value = CellUtil.getCell(r, j).getStringCellValue();
				myMap.put(key, value);
			}
			mapLists.add(myMap);
		}
		return mapLists;
	}


	
	
	
	
}
