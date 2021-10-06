package eatpeachy;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\pinpoint\\eatpeachy\\src\\eatpeachy\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			  driver.get("https://api.peachytaste.com/admins/login");

			  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(src,new File("C:\\pinpoint\\eatpeachy\\src\\image1.png"));
			  			

		
		  
		
		  
	}

}
