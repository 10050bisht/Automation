package DatatDrivenTest;


//
////import org.openqa.selenium.Alert;
////import java.util.List;
////import java.util.concurrent.TimeUnit;
//
////import java.io.File;
//
////import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
////import org.openqa.selenium.OutputType;
////import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.interactions.Actions;
//
//public class Login {
// static WebDriver driver;
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\pinpoint\\eatpeachy\\\DatatDrivenTest\\chromedriver.exe");
//		 driver= new ChromeDriver();
//		  driver.get("https://api.peachytaste.com/admins/login");
//		  driver.manage().window().maximize();
//		  
//		  login();
//	}
//	
//	public static void login() throws InterruptedException{
//		driver.findElement(By.name("email")).sendKeys("anuj_laravel@dev-story.com");
//		driver.findElement(By.name("password")).sendKeys("123456");
//		driver.findElement(By.id("login_btn")).click();
//		
//		
////		//alert message  handle in web:::::::::::::::::::::::::::::::::::::::::
////		  Alert alret= driver.switchTo().alert();
////		  System.out.println(alret.getText());
////		  alret.accept();// click on OK btn
////		  alret.dismiss();//click on cancel btn
//		
//		
//		
////	//	Handle PopUp like browse any file from desktop:::::::::::::::::::::::::::::::::::::::::
////		driver.findElement(By.id(" ")).sendKeys("path of file which you want to upload");
//		
//		
//////		Handle Frames:::::::::::::::::::::::::::::::::::::::::
////		 driver.switchTo().frame("mainpanel");
////		  Thread.sleep(3000);
////		  driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
//		
//		
////	//	Mouse Movement Concept :::::::::::::::::::::::::::::::::::::::::
////		Actions actions= new Actions(driver);
////		actions.moveToElement(driver.findElement(By.linkText("About us"))).build().perform();
////		Thread.sleep(3000);
////		driver.findElement(By.linkText("Fleat")).click();
//		
//		
//		
////	//	Drag and Drop :::::::::::::::::::::::::::::::::::::::::
////		  driver.switchTo().frame(0);
////		  Actions action = new Actions(driver) ;
////			action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
////			.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
////			.release()
////			.build()
////			.perform();
//		
//		
//////		Implicitly wait :::::::::::::::::::::::::::::::::::::::::
////		driver.manage().deleteAllCookies();// to delete all cookies
//////		dynamic Wait
////		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
////		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//
//////		Dynamic Xpath using different approach::::::::::::::::::::::::::::::::::
////		driver.findElement(By.xpath("//input[@class= 'input100']")).sendKeys("anuj_laravel@dev-story.com");
////		driver.findElement(By.xpath("//input[@name= 'email']")).sendKeys("anuj_laravel@dev-story.com");
//		
////		driver.findElement(By.xpath("//input[contains(@class,'email')]")).sendKeys("anuj_laravel@dev-story.com");
//
////		//dynamic id: not constant 
////		//id= test_123 
////		//by.id(test_123)
////		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("test");
//		
////		//starts-with method
////		//id= test_123 
////		//id=test_456  // id is change after refreshing the page 
////		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("test");
//		
////		//ends-with method
////		//id= 123_test_t 
////		//id=456_test_t  // id is change after refreshing the page 
////		driver.findElement(By.xpath("//input[ends-with(@id,'test_')]")).sendKeys("test");
//
//		
////		//for links custom xpath
////		//all the links are represented by <a> html tag
////		driver.findElement(By.xpath("//a[contains(text(), 'My Account')]")).click();
//
//		
//		
////		//1.get the total count of links on page 
////		//2.get the text of each link on page
////		List  <WebElement> linklist= driver.findElements(By.tagName("a"));
//		
////	//	Size of linkslist
//		//System.out.println(linklist.size());
////		for(int i=0; i<=linklist.size(); i++)
////		{
////			String linktext= linklist.get(i).getText();
////			System.out.println(linktext);
////		}
//		
//		
//		
////		//Navigation of forward and back urls
////		  driver.navigate().back();
////		  Thread.sleep(2000);
////		  
////		  driver.navigate().forward();
//		
//		
////		//Take Screen Shot ::::::::::::::::::::::::::::::::::::::::::
////		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////		  FileUtils.copyFile(src,new File("C:\\pinpoint\\eatpeachy\\src\\image1.png"));
//
//	}
//	 
//}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
//static WebDriver driver = new ChromeDriver(); 
public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\pinpoint\\EatPeachy_new\\src\\DatatDrivenTest\\chromedriver.exe");
  WebDriver driver = new ChromeDriver(); 
	

		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	 driver.get("https://classic.freecrm.com/index.html?e=1");
	 
//	  driver.findElement(By.name("username")).sendKeys("naveenk");
//	 driver.findElement(By.name("password")).sendKeys("test@123");
//	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
//	
//	 WebElement loginbtn =	driver.findElement(By.className("btn btn-small"));
	 String javascript = "driver.getElementByname('username').style.border='2px solid red'";  
	 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	 jsExecutor.executeScript(javascript); 
}
}

//public class Login{
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		 System.setProperty("webdriver.chrome.driver", "C:\\pinpoint\\eatpeachy\\src\\eatpeachy\\chromedriver.exe");
//		  WebDriver driver = new ChromeDriver(); 
//		  driver.get("https://beta.spicejet.com/");
//		  WebElement date= driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]"));
//			String dateval= "Wed,30 Dec 2020";
//			
//			 SelectDateByJS(driver, date , dateval);
//			
//			}
//	public static void SelectDateByJS(WebDriver driver,WebElement element,String dateval){
//		JavascriptExecutor js= ((JavascriptExecutor)driver);
//		js.executeScript("argument[0].setAttribute('Value','"+dateval+"');", element);
//		
//	
//	
//			}
//	}