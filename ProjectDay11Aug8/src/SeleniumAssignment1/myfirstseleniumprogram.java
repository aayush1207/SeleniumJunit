package SeleniumAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myfirstseleniumprogram {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","../ProjectDay11Aug8/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
//      driver.manage().window().maximize();		
		Options op = driver.manage();
		Window w = op.window();
		w.maximize();	
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("aayushrules@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input#pass"));
		password.sendKeys("6844$@ntroanq");
		WebElement login = driver.findElement(By.cssSelector("label[id='loginbutton']"));
		login.click();
				
		
	}

}
