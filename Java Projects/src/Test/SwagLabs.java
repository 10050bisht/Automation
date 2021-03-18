package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class SwagLabs {
	
	static WebDriver driver = new ChromeDriver();
	

		@Test(priority = 0)
		public void browser() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Himanshu\\Automation\\chromedriver.exe");
		driver.navigate().to("https://www.saucedemo.com/");
		}
		
		@Test(priority = 1)
		public void Landing(){
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		
		String expt_title = "Swag Labs";
		
		if(actual_title.equalsIgnoreCase(expt_title)) {
			System.out.println("Title is matched");
		}
		else {
			System.out.println("Title is not matched");
		}
	
		String url=driver.getCurrentUrl();
		System.out.println(url);
//		String mytext = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/text()[1]')]")).getText();
//		driver.findElement(By.id("user-name")).sendKeys(mytext);
//		
//		WebElement fromElement = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]"));
//		
//		WebElement toElement = driver.findElement(By.id("user-name"));
//		Actions builder = new Actions(driver);
//
//		//Building a drag and drop action
//		Action dragAndDrop = builder.clickAndHold(fromElement)
//		.moveToElement(toElement)
//		.release(toElement)
//		.build();
//
//		dragAndDrop.perform();
//		driver.switchTo().frame("Password for all users:");
//		int size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size);
//		
//		String login_pass= driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[2]")).getText();
		
		//h4[contains(text(),'Accepted usernames are:')]
//		String mytext = driver.findElement(By.xpath("//h4[contains(text(),'Accepted usernames are:')]')]\r\n')]")).getText();
//		driver.findElement(By.name("loginEmail")).sendKeys(mytext);
		
			WebElement username= driver.findElement(By.id("user-name"));
			if(username.isDisplayed() && username.isEnabled())
				username.sendKeys("ghghgh");
			System.out.println("Login field is enabled and enterd");
			
			WebElement Password = driver.findElement(By.id("password"));
			if(Password.isDisplayed() && Password.isEnabled())
				Password.sendKeys("hgfh");
			System.out.println("Password field is enabled and enterd");
			
			WebElement login = driver.findElement(By.id("login-button"));
			if(login.isDisplayed() && login.isEnabled())
				login.click();
			System.out.println("Login button is enabled and clicked");
			
//			For print error message ::--
//			String errormsg= driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/form[1]/h3[1]")).getText();
//			 System.out.println(errormsg);
		}
		
//		@Test(priority = 2)
//		public void Cart_btn() {
//			WebElement Cart_btn = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button"));
//			if(Cart_btn.isDisplayed() && Cart_btn.isEnabled())
//				Cart_btn.click();
//			System.out.println("Cart_btn is enabled and clicked");
//		}
//			
//		@Test(priority = 3)
//		public void cart_img() {
//			WebElement cart_img= driver.findElement(By.id("shopping_cart_container"));
//			if(cart_img.isDisplayed() && cart_img.isEnabled())
//				cart_img.click();
//			System.out.println("cart_img is enabled and clicked ");
//		}
//		
//		@Test(priority = 4)
//		public void chkout_btn() {
//			WebElement chkout_btn= driver.findElement(By.xpath("//a[contains(text(),'CHECKOUT')]"));
//			if(chkout_btn.isDisplayed() && chkout_btn.isEnabled())
//				chkout_btn.click();
//			System.out.println("chkout_btn is enabled and clicked");
//		}
//		
//		@Test(priority = 5)
//		public void cancel_btn() {
//			WebElement cancel_btn= driver.findElement(By.xpath("//a[contains(text(),'CANCEL')]"));
//			if(cancel_btn.isDisplayed() && cancel_btn.isEnabled())
//				cancel_btn.click();
//			System.out.println("cancel_btn is enabled and clicked");
//		}
//		
//		@Test(priority = 6)
//		public void remove_btn() {
//			WebElement remove_btn = driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]"));
//			if(remove_btn.isDisplayed() && remove_btn.isEnabled())
//				remove_btn.click();
//			System.out.println("remove_btn is enabled and clicked");
//		}
//		
//		@Test(priority = 7)
//		public void navigate_back() {
//			driver.navigate().back();
//			System.out.println("Navigate to back button");
//		}
//		
//		@Test(priority = 8)
//		public void menu_btn() {
//			WebElement menu_btn = driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]"));
//			if(menu_btn.isDisplayed() && menu_btn.isEnabled())
//				menu_btn.click();
//			System.out.println("menu_btn is enabled and clicked");
//		}
//		
//		@Test(priority = 9)
//		public void logout_btn() {
//			WebElement logout_btn = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
//			if(logout_btn.isDisplayed() && logout_btn.isEnabled())
//				logout_btn.click();
//				System.out.println("logout_btn is enabled and clicked");
//		}
}

