package Selenium.Naveen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPrg {
	public static void main(String[] args) throws IOException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		String title=d.getTitle();
		System.out.println("Title of website is:"+title);
		File scrnsht=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);		
		FileHandler.copy(scrnsht, new File("D://Bino//1.png"));
	}
}
