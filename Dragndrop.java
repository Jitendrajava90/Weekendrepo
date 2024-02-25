package Selenium.Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.globalsqa.com/demo-site/draganddrop/");
		d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement draggable=d.findElement(By.xpath("/html/body/div[1]/ul/li[1]/img"));
	    WebElement droppable=d.findElement(By.xpath("/html/body/div[1]/div"));
	    Actions action=new Actions(d);
	    action.dragAndDrop(draggable, droppable);
	    System.out.println("Drag and drop is done");
	
	
	}

}
