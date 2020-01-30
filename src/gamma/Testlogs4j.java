package gamma;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlogs4j {
	
	  private static Logger log=LogManager.getLogger(Testlogs4j.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.info("Window is getting maximized");;

		driver.manage().window().maximize();
		log.info("Launching the Amazon Official Website");
		driver.get("https://www.amazon.in/");
		log.debug("Enter the search item as tables");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tables");
		log.debug("After entering the search item, pressing enter button");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		log.error("No errors found but test if logs are getting printed for error");

	}

}
