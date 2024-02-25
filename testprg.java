package Selenium.Naveen;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testprg {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
        d.findElement(By.xpath("//*[@id=\"gender-0\"]")).click();
        Select oselect=new Select(d.findElement(By.xpath("//*[@id=\"course\"]")));
        //select by visible text
        oselect.selectByVisibleText("Computer Course");
        Thread.sleep(4000);
        oselect.deselectByIndex(1);
        oselect.selectByIndex(3);
	    //select by index
        //oselect.selectByIndex(0);
        //select by id
        //oselect.selectByValue("Other Course");
	
	}

}
