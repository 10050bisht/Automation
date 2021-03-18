package Test;
import java.lang.*;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Leaves {
	 static WebDriver driver = new ChromeDriver() ;
	 
	public static void main(String[] args) throws IOException {
	
	 System.setProperty("Webdriver.chrome.driver", "C:\\Himanshu\\Automation\\chromedriver.exe");
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	 Browser();
	 Screenshot("Browser"); //Sceenshot methot calling
		System.out.println("Browser page screenshot completed");
	
		login();
		Screenshot("Login");
		System.out.println("Login page screenshot completed");
		
		Leave();
		Screenshot("Leaves");
		System.out.println("Leaves page screenshot completed");

	}
	@Test(priority = 1)
	public static void Screenshot(String fileName ) throws IOException {
//Take Screenshot start
//		 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 FileUtils.copyFile(file, new File("C:\\Himanshu\\Automation\\src\\test\\Leaves.java" +fileName +"..png"));
//Screenshot ends
	}
	
	@Test(priority = 2)
	 public static void Browser() throws IOException {
	
		String actualTitle = driver.getTitle();
		String expectedTitle= "OrangeHRM";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		
	}
	
	
	@Test(priority = 3)
	 public static void login() {

		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
			  
 }
	
	@Test(priority = 4)
	  public static void  Leave() {
	  driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	
		  driver.findElement(By.id("calFromDate")).click();
			 
//			 driver.findElement(By.className("ui-datepicker-month")).sendKeys("Mar");
		  	Select month= new Select(driver.findElement(By.className("ui-datepicker-month")));
			 month.selectByVisibleText("Mar");
			 
//			 driver.findElement(By.className("ui-datepicker-year")).sendKeys("2021");
			 Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
			 year.selectByVisibleText("2020");
			 
			driver.findElement(By.linkText("8")).click();
			
			
			driver.findElement(By.id("calToDate")).click();
			 
			 Select month1= new Select(driver.findElement(By.className("ui-datepicker-month")));
			 month1.selectByVisibleText("Mar");
			 
			 Select year1 = new Select(driver.findElement(By.className("ui-datepicker-year")));
			 year1.selectByVisibleText("2020");
			 
				driver.findElement(By.linkText("10")).click();	
				
				driver.findElement(By.xpath("//label[text()='Pending Approval']")).click();

				driver.findElement(By.xpath("//label[text()='Rejected']")).click();
				
				driver.findElement(By.id("btnSearch")).click();	

	 } 
	 
}
