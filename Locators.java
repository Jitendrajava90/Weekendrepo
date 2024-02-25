package Jitendra.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.get("https://ctet.nic.in/");
		d.manage().window().maximize();
		//d.findElement(By.name("login1")).sendKeys("Navin");
		//d.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		//d.findElement(By.linkText("Forgot Password?")).click();
		
		//input[@type='password']
		
		//d.findElement(By.linkText("Create a new account")).click();
		//d.findElement(By.xpath("//input[@name='confirm_passwd115ed2e4']")).sendKeys("Navin");
		
		d.findElement(By.partialLinkText("Calculation Sheet")).click();
		
		
	}

}
