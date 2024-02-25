package Selenium.Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateScenario {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://emicalculator.net/");
		Thread.sleep(10);
		System.out.println(d.getTitle());
		WebElement widget=d.findElement(By.xpath("/html/body/header/div/nav/div[2]/div/ul/li[3]/a"));
				
				widget.click();
				System.out.println("doing");
//		d.navigate().back();
	//	Thread.sleep(4000);
		//d.navigate().to("https://emicalculator.net/category/articles/");
	}
	
	

}
