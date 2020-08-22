package SeleniumAssignment4;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.*;

public class fbloginpagejunit 
{
	ChromeDriver driver;
	
	public void dropDownSelectionIndex(int index, WebElement element)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public void dropDownSelectionValue(int index, WebElement element)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public void dropDownSelectionText(String text, WebElement element)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
         @Before
         public void BrowserLaunch()  throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","../ProjectDay11Aug8/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.facebook.com/"); 
				driver.manage().window().maximize();
				WebElement newact = driver.findElement(By.id("u_0_2"));
				newact.click();	
        	    Thread.sleep(3000);
							
		}
//				Options op = driver.manage();
//				Window w = op.window();
//				w.maximize();
         @Test
         public void SignUp()
         {
        	 
				WebElement fname = driver.findElement(By.name("firstname"));
				fname.sendKeys("Aayush");
				WebElement lname = driver.findElement(By.id("u_1_d"));
				lname.sendKeys("Aggarwal");
				WebElement email = driver.findElement(By.cssSelector("input[id='u_1_g']"));
				email.sendKeys("abc@gmail.com");
				WebElement reemail = driver.findElement(By.cssSelector("input[id='u_1_j']"));
				reemail.sendKeys("abc@gmail.com");
				WebElement newpass = driver.findElement(By.id("password_step_input"));
				newpass.sendKeys("aayush@1");
				fbloginpagejunit dd = new fbloginpagejunit();
				WebElement day = driver.findElement(By.id("day"));
				dd.dropDownSelectionIndex(12,day);
//				Select s1=new Select(day);
//				s1.selectByIndex(12);
				WebElement month = driver.findElement(By.id("month"));
				dd.dropDownSelectionIndex(7,month);
//				Select s2=new Select(month);
//				s2.selectByIndex(7);
				WebElement year = driver.findElement(By.id("year"));
				dd.dropDownSelectionText("1990",year);
				WebElement gender = driver.findElementById(("u_1_5"));
				gender.click();
				WebElement signup = driver.findElement(By.name("websubmit"));
				signup.click();					
				}	
         
         @After
         public void browserClose()
         {
        	 driver.close();
         }}
				
//				Select s3=new Select(year);
//				s3.selectByVisibleText("1990");
// gender = driver.findElementById(("u_1_5"));
//				gender.click();
//				WebElement signup = driver.findElement(By.name("websubmit"));
//				signup.click();
