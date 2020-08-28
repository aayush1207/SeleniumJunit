//Action class Assignment 4 - FB login page using find elements

package ActionClassAssignment7;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fbloginusingactionclass 
{
          public static void main(String[] args) 
          {
        	  System.setProperty("webdriver.chrome.driver","../ProjectDay11Aug8/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/"); 
				driver.manage().window().maximize();
				WebElement email = driver.findElementById("email");
				email.sendKeys("abc@gmail.com");
				Actions ak = new Actions(driver);
				ak.sendKeys(Keys.TAB).perform();
				WebElement password = driver.findElementById("pass");
				password.sendKeys("1234");
				ak.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		}
	}


