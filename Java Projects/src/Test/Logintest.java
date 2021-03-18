package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	static WebDriver driver = new ChromeDriver();

	   
	 
	public static  void main(String[] args)  {
		System.setProperty("Webdriver.chrome.driver", "C:\\Himanshu\\Automation\\chromedriver.exe");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle= "OrangeHRM";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		
		
		
		
//		Screenshot("login"); //Sceenshot methot calling
//		System.out.println("Login page screenshot completed");
		
	
//		public static void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  
		  driver.findElement(By.id("btnLogin")).click();
		  
//		  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
//		  WebElement to=   driver.findElement(By.id("searchSystemUser_employeeName_empName"));
//		  to.sendKeys("a");
//		  
//		  Actions act = new Actions(driver);
//			act.sendKeys(Keys.DOWN).perform();
//			act.sendKeys(Keys.DOWN).perform();
//			act.sendKeys(Keys.ENTER).perform();
//			// This code for open a new Tab  
//			System.out.println();
		
			/*
			 * Example for Visibility of Elements located by
			 */
			/*WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("locSelectVal")));
			
			List<WebElement> list = driver.findElements(By.id("locSelectVal"));
			
			System.out.println("Auto Suggest List ::" + list.size());
			
			for(int i = 1 ;i< list.size();i++)
			{
				System.out.println(list.get(i).getText());
				
				if(list.get(i).getText().equals("Glen Allen"))
				{
					list.get(i).click();
					break;
				
				
				}*/
			//driver.close();
		  }

// This will capture error message Start
//		  String actual_msg=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
//		  // Store message in variable
//		  String expect="Username cannot beempty";
//		  
//		  if(actual_msg.equals(expect)) {
//				System.out.println("Message  Matched" );
//		  }
//			else {
//				System.out.println("Message didn't match" );
//		  
//			}
//		  // Verify error message
//		  Assert.assertEquals(actual_msg, expect);
		  
// This will capture error message Ends

//		}
	
		  
//			public static void Screenshot(String fileName ) throws IOException {
			//Take Screenshot start
//					 File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//					 FileUtils.copyFile(file, new File("C:\\Himanshu\\Automation\\src" +fileName +"..png"));
			//Screenshot ends
//				}
		  
//Mouse hover example Start
//		  Actions action = new Actions(driver);
//	        WebElement element = driver.findElement(By.xpath("//b[contains(text(),'Leave')]"));
//
//	        //Mouse hover actions on an element using Actions Class:
//	        action.moveToElement(element).build().perform();
//
//	        WebElement element2 = driver.findElement(By.xpath("//a[@id='menu_leave_assignLeave']"));
//	        action.moveToElement(element2);
//	        //Mouse hover actions on a sub-element using Actions Class:
//	        action.click().build().perform();
// Mouse Hover example Ends
		  
// This will capture error message Example Start
//		  String actual_msg=driver.findElement(By.id("spanMessage")).getText();
		      
		  // Store message in variable
//		  String expect="Username cannot be empty";
//		                  
//		  // Here Assert is a class and assertEquals is a method which will compare two values if// both matches it will run fine but in case if does not match then if will throw an 
//		  //exception and fail testcases
//		   
//		  // Verify error message
//		  Assert.assertEquals(actual_msg, expect);
//		  
//		  if(actual_msg.equalsIgnoreCase(expect))
//				System.out.println("message Matched");
//			else
//				System.out.println("message didn't match");
//Error message example Ends
		
//Drag and Drop Example Start
		//Element which needs to drag.    		
//      	WebElement From=driver.findElement(By.id("btnLogin"));	
//      	
//      	 System.out.println(From+"it is form");
//       //Element on which need to drop.		
//       WebElement To=driver.findElement(By.id("txtUsername"));	
//       
//       System.out.println(To+"it is form");
//       //Using Action class for drag and drop.		
//       Actions act=new Actions(driver);		
//       System.out.println("action");
//
//		//Dragged and dropped.		
//       act.dragAndDrop(From, To).build().perform();		
//       System.out.println("act.draganddrop");
//Drag and Drop Example End
		  

	
	
		  
//		  driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
//
//			 driver.findElement(By.id("calFromDate")).click();
//			 
////			 driver.findElement(By.className("ui-datepicker-month")).sendKeys("Mar");
//Select month= new Select(driver.findElement(By.className("ui-datepicker-month")));
//			 month.selectByVisibleText("Mar");
//			 
////			 driver.findElement(By.className("ui-datepicker-year")).sendKeys("2021");
//			 Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
//			 year.selectByVisibleText("2021");
//			 
//			driver.findElement(By.linkText("8")).click();
//			
//			
//			driver.findElement(By.id("calToDate")).click();
//			 
//			 Select month1= new Select(driver.findElement(By.className("ui-datepicker-month")));
//			 month1.selectByVisibleText("Mar");
//			 
//			 Select year1 = new Select(driver.findElement(By.className("ui-datepicker-year")));
//			 year1.selectByVisibleText("2021");
//			 
//				driver.findElement(By.linkText("10")).click();
//			 
}

