package DatatDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {

	WebDriver driver;
	
	@Test
	@Parameters({"url" , "emailId"})
	public void yahoologin(String url,String emailId){
		System.setProperty("webdriver.chrome.driver", "C:\\pinpoint\\EatPeachy_new\\src\\DatatDrivenTest\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(emailId);
		
		driver.findElement(By.name("signin")).click();

		
		
		
		
	}
}
//eP^paY-s(9GY_wS