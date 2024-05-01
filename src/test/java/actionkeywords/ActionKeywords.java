package actionkeywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class ActionKeywords {
	static WebDriver driver;
	//openBrowser()
	public static void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void goToUrl() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	public static void enterUserName() {
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
	}
	public static void enterPassword() {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	}
	public static void clickLogin() {
		WebElement loginBtn = driver.findElement(By.xpath("//*[@type ='submit']"));
		loginBtn.click();
	}
public static void clickDirectory() {
	WebElement directory = driver.findElement(By.linkText("Directory"));
	directory.click();
	
	
}
public static void selectQALead() {
	
}
}
