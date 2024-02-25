package Selenium.Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpract {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		WebElement hello =d.findElement(By.xpath("//*[@id=\"full_name\"]"));
		hello.sendKeys("Naveen");
		hello.clear();
			Thread.sleep(5000);
		hello.sendKeys("ABC");
			
	}

}
