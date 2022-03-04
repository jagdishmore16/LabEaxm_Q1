package fi.LabExam_softEngg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	 ChromeDriver driver;
 	String url = "http://www.flipkart.com";

 	public void invokeBrowser() {

 		System.setProperty("webdriver.chrome.driver",
 				"D:\\Document\\Software_Engineering\\chromedriver_win32\\chromedriver.exe");

 		driver = new ChromeDriver();

 		driver.manage().window().maximize();

 		driver.get(url);

 	}
 	public void loginToFlipkart() {
 		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("testuser@abc.com");
 		
 		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Test@1234");
 		
 		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
 		
 	}	
    	public static void main(String[] args) throws InterruptedException 
    	{
    		App ob = new App();
    		ob.invokeBrowser();
    		ob.loginToFlipkart();
    	}
    }

