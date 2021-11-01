package DatatDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizeTest {

	public static void main(String[] args) {
//Write Driver Code=================================
		 System.setProperty("webdriver.chrome.driver", "C:\\pinpoint\\EatPeachy_new\\src\\DatatDrivenTest\\chromedriver.exe");
		 WebDriver driver =new   ChromeDriver();
		  driver.get("https://peachytaste.com/#/");
		  driver.findElement(By.xpath("//span[contains(text(),'Accept All')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'SIGN UP')]")).click();
		  
//XLS_READER file=================================
		Xls_Reader reader =new Xls_Reader("C:\\pinpoint\\EatPeachy_new\\src\\DatatDrivenTest\\eatpechy_readdata.xlsx");
		int rownCount= reader.getRowCount("Sheet1");
		
		reader.addColumn("Sheet1", "Status");
		
//		Parameterization=======================================
		for (int rowNum = 2; rowNum <= rownCount; rowNum++) {
			
			System.out.println("=====");
			String  FirstName= reader.getCellData("Sheet1", "FirstName", rowNum);
			System.out.println(FirstName);
			
			 String LastName=reader.getCellData("Sheet1", "LastName", rowNum);
			 System.out.println(LastName);
			 
			 String Email=reader.getCellData("Sheet1", "Email", rowNum);
			 System.out.println(Email);
			 
			 String CountryCode=reader.getCellData("Sheet1", "CountryCode", rowNum);
			 System.out.println(CountryCode);
			 
			 String PhoneNumber =reader.getCellData("Sheet1", "PhoneNumber", rowNum);
			 System.out.println(PhoneNumber);
			 
			 String Password =reader.getCellData("Sheet1", "Password", rowNum);
			 System.out.println(Password);
			 
			 String ConfirmPassword =reader.getCellData("Sheet1", "ConfirmPassword", rowNum);
			 System.out.println(ConfirmPassword);
			 
			 String Address =reader.getCellData("Sheet1", "Address", rowNum);
			 System.out.println(Address);
			 
			 String ZipCode =reader.getCellData("Sheet1", "ZipCode", rowNum);
			 System.out.println(ZipCode);
			 
			 String City =reader.getCellData("Sheet1", "City", rowNum);
			 System.out.println(City);
			 
			 String Country =reader.getCellData("Sheet1", "Country", rowNum);
			 System.out.println(Country);
			 
			 String AddressHint =reader.getCellData("Sheet1", "AddressHint", rowNum);
			 System.out.println(AddressHint);
			 
			 
//Enter Signup Details with findElements===================================
			 driver.findElement(By.id("first_name")).clear();
			  driver.findElement(By.id("first_name")).sendKeys(FirstName);
			  
			  driver.findElement(By.id("last_name")).clear();
			  driver.findElement(By.id("last_name")).sendKeys(LastName);
			  
			  driver.findElement(By.id("email")).clear();
			  driver.findElement(By.id("email")).sendKeys(Email);

//			  Select d1 = new Select(driver.findElement(By.className("form-control form-field select-field")));
//			  d1.selectByVisibleText(CountryCode);
			  driver.findElement(By.id("phone")).clear();
			  driver.findElement(By.id("phone")).sendKeys(PhoneNumber);

			  driver.findElement(By.id("password")).clear();
			  driver.findElement(By.id("password")).sendKeys(Password);

			  driver.findElement(By.name("confirm_password")).clear();
			  driver.findElement(By.name("confirm_password")).sendKeys(Password);

			  driver.findElement(By.id("address")).clear();
			  driver.findElement(By.id("address")).sendKeys(Address);

			  driver.findElement(By.id("pincode")).clear();
			  driver.findElement(By.id("pincode")).sendKeys(ZipCode);

//			  Select d2 = new Select(driver.findElement(By.xpath("//select(@id class = 'country')")));
//			  d2.selectByVisibleText(Country);
			  
			  driver.findElement(By.id("address_hint")).clear();
			  driver.findElement(By.id("address_hint")).sendKeys(AddressHint);
			  
			  reader.setCellData("Sheet1", "Status", rowNum, "Pass");// Write Data into a Cell
		}
//		if (!reader.isSheetExist("Homepage")) {
//			reader.addSheet("Homepage");
//			
//		}
//		
//		int colNum=reader.getColumnCount("Sheet1");
//		System.out.println("Total collumn are present in sheet1=="+colNum);
//		
//		int cellRowNUm= reader.getCellRowNum("Sheet1", "FirstName", "Himanshu");
//		System.out.println(cellRowNUm);
//		
	}

}
