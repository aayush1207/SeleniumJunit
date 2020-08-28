//Action Class Assignment 2 - Play a video with the help of Find elements

package ActionClassAssignment5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","../ProjectDay11Aug8/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/"); 
		driver.manage().window().maximize();
		WebElement video = driver.findElementById("video-title");
		video.click();
		
	}

}
