package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webautomate {

	public static void main(String[] args) {
		 
		 System.out.println("Execution after setting ChromeDriver path in System Variables");
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Himanshu\\Automation\\HimanshuProjects\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();

		 driver.get("https://demoqa.com");
		 driver.quit();
		 System.out.println("Execution complete");
		 
		 }

}

 
