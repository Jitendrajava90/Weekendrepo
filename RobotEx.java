package Jitendra.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotEx {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"full_name\"]")).sendKeys("Navin");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		//r.mouseMove(654, 245);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		
		
		
		
		
		

	}
	
}
