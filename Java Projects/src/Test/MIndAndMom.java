package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MIndAndMom {

	static WebDriver driver = new ChromeDriver();
	
	@Test(groups = "browser")
	void browser() {
		System.setProperty("WebDriver.chrome.driver", "C:\\Himanshu\\Automation\\chromedriver.exe");
		driver.get("https://admin.mindandmom.com/"); //or  driver.navigate().to("https://admin.mindandmom.com");

	}
	
	@Test(groups = "login")
		void login() {
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("admin@mind.com");
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).sendKeys("admin");
			 driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			 
			 driver.findElement(By.className("nav-item cup-icon nav-link")).click();

		}
//
//		@Test(groups = "url")
//		void url() {
//			WebElement newurl= driver.get("https://admin.mindandmom.com/login");
//			
//			System.out.println(newurl);
//
//			if (newurl.equals("https://admin.mindandmom.com/login")){
//			System.out.println("Login Successful – Passed");
//			}
//			else{
//			System.out.println("Login Unsuccessful – Failed");
//			}
//			
//			 }
	
}
