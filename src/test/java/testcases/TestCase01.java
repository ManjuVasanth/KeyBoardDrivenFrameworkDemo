package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// no need of this TestCase01 class since we are going to maintain in ExcelSheet
public class TestCase01 {
	public static void main(String[] args) {
		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//go to url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//enter username
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		//enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		//clicklogin button
		WebElement loginBtn = driver.findElement(By.xpath("//*[@type ='submit']"));
		loginBtn.click();
	}


}
