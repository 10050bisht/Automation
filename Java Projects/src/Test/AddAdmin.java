package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class AddAdmin {
	  static WebDriver driver = new ChromeDriver();
		public static void main(String[] args) {
			Browser();
			login();
			AddingAdmin();
		
		}
	
	  @BeforeSuite
	 public static void Browser() {
	

		System.out.print("Hello");
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\JavaProjectAuto\\chromedriver.exe");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
	}
	  @Test
	 public static void login( ) {
//			driver.findElement(By.linkText("Login")).click();
		
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
		
		  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
  }
	 @AfterTest
	 public static void AddingAdmin() {
		 
		 
		 driver.findElement(By.id("btnAdd")).click();
//		 
//		 Select dropdown= new Select(driver.findElement(By.id("systemUser_userType")));
//		 dropdown.selectByValue("1");
//		 
//		 driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Aaliyah Haq");
//		 
//		 driver.findElement(By.name("systemUser[userName]")).sendKeys("Aaliyah ");
//		 
//		 Select dropdown1= new Select(driver.findElement(By.id("systemUser_status")));
//		 dropdown1.selectByValue("1");
//		 
//		 driver.findElement(By.id("systemUser_password")).sendKeys("12345678");
//		 
//		 driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("12345678");
//		 
//		 driver.findElement(By.id("btnSave")).click();
//		 
	 }
	 
	 @AfterTest

	 public static void Searching() {
		 
		 driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Charlie Carter");
		 
		 Select dropdown2= new Select(driver.findElement(By.id("searchSystemUser_userType")));
		 dropdown2.selectByVisibleText("ESS");
		 
		 driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Charlie.Carter");
		 
		 Select dropdown3= new Select(driver.findElement(By.id("searchSystemUser_status")));
		 dropdown3.selectByVisibleText("Enabled");
		 
		 driver.findElement(By.id("searchBtn")).click();

	 }
	 
	 
}
