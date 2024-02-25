package Selenium.Naveen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.deltadental.com/");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body"
			+ "/section[1]/div/div/div[1]/header/div[2]/div/div/div[1]/div/nav/ul/li[2]/a")));
	System.out.println("It works as expected");
	//driver.quit();
	driver.quit();
	
	
}
	
}
