//Action  Class Assignment 3 - Play video and multiple tab handling.

package ActionClassAssignment6;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youtubemultipletab 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","../ProjectDay11Aug8/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/"); 
		driver.manage().window().maximize();
		WebElement videoplay = driver.findElementById("video-title");
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(videoplay).keyUp(Keys.CONTROL).build().perform();
		System.out.println("Current UR: opened is "+driver.getCurrentUrl());
		
		String Current = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		System.out.println("total number of tabs opened are "+all.size());
		for(String s: all)
		{
			driver.switchTo().window(s);
		}
		System.out.println("Current Tab URL is "+driver.getCurrentUrl());
		
	}

}
