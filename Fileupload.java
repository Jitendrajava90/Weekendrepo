package Selenium.Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("Dfdsdfsdfsdfsdfsdfds");
		d.findElement(By.xpath("//*[@id=\"mydropzone_photo]")).sendKeys("D:\\Personal\\Chandan\\ChandanPIC.jpg");
	}

}
