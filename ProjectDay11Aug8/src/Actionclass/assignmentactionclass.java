// Action Class - Assignment 1 - MMT From and To.

package Actionclass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;


public class assignmentactionclass 
{
	public static void main(String[] args) throws InterruptedException 
	{
				System.setProperty("webdriver.chrome.driver","../ProjectDay11Aug8/chromedriver.exe");
					ChromeDriver driver = new ChromeDriver();
					driver.get("https://www.makemytrip.com/"); 
					driver.manage().window().maximize();	
					WebElement fcity = driver.findElementById("fromCity");
					fcity.click();
					WebElement from = driver.findElement(By.cssSelector("input[placeholder='From']"));
					from.click();
					Actions ac = new Actions(driver);
					for(int i=0;i<3;i++)
					{
					ac.sendKeys(Keys.ARROW_DOWN).perform();
					}
					ac.sendKeys(Keys.ENTER).perform();
					WebElement to = driver.findElement(By.cssSelector("input[placeholder='To']"));
					to.click();
					Actions ak = new Actions(driver);
					for(int i=0;i<2;i++)
					{
					ak.sendKeys(Keys.ARROW_DOWN).perform();
					}
					ak.sendKeys(Keys.ENTER).perform();
					
					
		
	}

}
