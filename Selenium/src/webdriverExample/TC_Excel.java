package webdriverExample;
import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;
public class TC_Excel {

	public static void main(String[] args) throws Exception
	{
		FileInputStream file = new FileInputStream("D:\\Selenium\\Driver\\Emp.xls");
		Workbook   wb = Workbook.getWorkbook(file);
		Sheet      st = wb.getSheet(0);
		int row=2;
		String EmpId = st.getCell(0,row).getContents();
		String EmpName = st.getCell(1,row).getContents();
		String EmpNum = st.getCell(2,row).getContents();
		

		System.out.println(EmpId +"||"+EmpName+"||"+EmpNum);

	}

}
