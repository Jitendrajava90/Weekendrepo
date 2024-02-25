package Jitendra.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TheAutomationZone {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		WebElement w= d.findElement(By.xpath("//*[@id=\"full_name\"]"));
		w.sendKeys("Jitendra");
		Thread.sleep(1000);
		WebElement ww = d.findElement(By.xpath("//*[@id=\"father_name\"]"));
		ww.sendKeys("Maske");
		Thread.sleep(1000);
		//w.clear();
		//w.sendKeys("Maske");
		
		Select s =new Select(d.findElement(By.xpath("//*[@id=\"course\"]")));
		Thread.sleep(1000);
		s.selectByVisibleText("Computer Course");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"post-body-117307921169131176\"]/div[3]/div/form/fieldset/div[7]/div/label[1]")).click();
		
		
		
		
	}

}
