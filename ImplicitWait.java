package Selenium.Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.deltadental.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
}

// implicit wait:
