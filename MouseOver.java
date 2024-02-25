package Jitendra.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.deltadental.com/");
		d.manage().window().maximize();
		WebElement we = d.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/header/div[2]/div/div/div[1]/div/nav/ul/li[2]/a"));
		Actions a =new Actions(d);
		a.moveToElement(we).build().perform();
		Thread.sleep(5000);
		d.findElement(By.linkText("Member FAQ")).click();
		
		
		

	}

}
