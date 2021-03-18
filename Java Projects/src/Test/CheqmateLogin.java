package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheqmateLogin {
	
	static WebDriver driver = new ChromeDriver();
	public static  void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Himanshu\\Automation\\chromedriver.exe");
		driver.navigate().to("http://3.131.158.101:3000/welcome");
		
		driver.findElement(By.name("loginEmail")).sendKeys("10050bisht@gmail.com");
		driver.findElement(By.name("loginPassword")).sendKeys("weewqewqewqew");
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[1]/div/div/div/div/form/div/div[1]/div[5]/button")).click();
		
		String errormsg= driver.findElement(By.className("text-danger py-2 inline-block")).getText();
		 System.out.println(errormsg);
//		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
//		String expectedTitle= "CheqMate";
//		if(actualTitle.equalsIgnoreCase(expectedTitle))
//			System.out.println("Title  match");
//		else
//			System.out.println("Title didn't Matched");
//
//		
//		
//		String actualtext = driver.findElement(By.xpath("//h4[contains(text(),'Why should you be using CheqMate?')]")).getText();
//		System.out.println(actualtext);
//		String expectedtext= "Why should you be using CheqMate?";
//		if(actualtext.equals(expectedtext)) 
//			System.out.println("Text  match");
//		else 
//			System.out.println("Text didn't Matched");
//		
//
//		String actualtext1 = driver.findElement(By.xpath("//p[contains(text(),'©2020 All rights Reserved. cheqmatefinancial.com C')]")).getText();
//		System.out.println(actualtext1);
//		String expectedText1= "©2020 All rights Reserved. cheqmatefinancial.com Cookie Preferences, Privacy. and Terms.";
//		if(actualtext1.equals(expectedText1)) 
//			System.out.println("Text1  match");
//		else 
//			System.out.println("Text1 didn't Matched");
//		
		
//		WebElement textbox_username = driver.findElement(By.name("loginEmail"));
//		if(textbox_username.isEnabled()) {
//			System.out.println("username is enabled");
//			textbox_username.sendKeys("qwert@gmail.com");
//		}
//		
//		driver.findElement(By.xpath("//body/div[@id='root']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/button[1]")).click();

		
//		do {
//			
//			System.out.println("password is displayed");
//		}
//		while (driver.findElement(By.name("loginPassword")).isDisplayed());

//		Copy and paste Example::-
//		String mytext = driver.findElement(By.xpath("//h4[contains(text(),'Why should you be using CheqMate?')]")).getText();
//		driver.findElement(By.name("loginEmail")).sendKeys(mytext);
		
//		Drag and Drop Example::-
//		Actions builder = new Actions(driver);
//
//		WebElement fromElement = driver.findElement(By.xpath("//h4[contains(text(),'Why should you be using CheqMate?')]"));
//		
//		WebElement toElement = driver.findElement(By.name("loginEmail"));
//
//		builder.dragAndDrop(fromElement, toElement).perform();
		
		//Building a drag and drop action
//		Action dragAndDrop = builder.clickAndHold(fromElement)
//		.moveToElement(toElement)
//		.release(toElement)
//		.build();
//
//		dragAndDrop.perform();
		
//		driver.findElement(By.name("loginEmail")).sendKeys("10050bisht@gmail.com");
//		driver.findElement(By.name("loginPassword")).sendKeys("weewqewqewqew");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[1]/div/div/div/div/form/div/div[1]/div[5]/button")).click();
		
	
//		int size1 = driver.findElements(By.className("login-form-content")).size();
//		System.out.println(size1);

//		driver.findElement(By.cssSelector("a.active:nth-child(1)")).click();
		
	}

}
