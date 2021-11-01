package DatatDrivenTest;

import java.util.ArrayList;

public class TestUtil {
static DatatDrivenTest.Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){

		ArrayList <Object[]> myData = new ArrayList<Object[]>();
	
		try{
			reader= new Xls_Reader("C:\\pinpoint\\EatPeachy_new\\src\\DatatDrivenTest\\readdata.xlsx");
		}catch(Exception e){
			e.printStackTrace();
			reader.addColumn("Sheet1", "Status");

		}
			for (int rowNum = 2; rowNum < reader.getRowCount("Sheet1"); rowNum++) {

					String Email=reader.getCellData("Sheet1", "Email", rowNum);
					String Password= reader.getCellData("Sheet1", "Password", rowNum);	
					Object ob[]= {Email,Password};
					myData.add(ob);
					
					reader.setCellData("Sheet1", "Status", rowNum, "Pass");
}
			return myData;
			}
	
	}
	

