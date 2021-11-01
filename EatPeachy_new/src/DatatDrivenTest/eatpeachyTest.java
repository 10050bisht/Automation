package DatatDrivenTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class eatpeachyTest {
//	reader.addColumn("Sheet1", "Status");

	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\pinpoint\\EatPeachy_new\\src\\DatatDrivenTest\\chromedriver.exe");
			driver =new   ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
//			reader.addColumn("Sheet1", "Status");

	}
	
	@DataProvider
	public Iterator<Object[]> getTestData(){
		ArrayList <Object[]> testData =TestUtil.getDataFromExcel();
		return testData.iterator();

	}
	
	
	
	@Test(dataProvider="getTestData")
	public void eatpeachyLoginPage(String Email,String Password){
		  driver.findElement(By.id("txtUsername")).clear();
		  driver.findElement(By.id("txtUsername")).sendKeys(Email);
		  
		  driver.findElement(By.id("txtPassword")).clear();
		  driver.findElement(By.id("txtPassword")).sendKeys(Password);
		  
//		  driver.findElement(By.id("btnLogin")).clear();
		  driver.findElement(By.id("btnLogin")).click();
		  
//			reader.setCellData("Sheet1", "Status", rowNum, "Pass");

		  
		  WebElement welcomemsg = driver.findElement(By.id("welcome"));
		  if (welcomemsg.isDisplayed())
		  {
			System.out.println("user is logined successfully");
		}
		  else{
			  System.out.println("user is not logined successfully");
		  }
		  
		  
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
		
		
		
	}