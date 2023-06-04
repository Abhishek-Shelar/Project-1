package Practice010523;
//to open the facebook by xpathth method and entger the value in that

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class Example2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//to enter the username 
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9096018067");
	//to enter the password
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9096018067");
	Thread.sleep(5000);
	//to click on login button
	driver.findElement(By.xpath("//button[@value='1']")).click();
	}
}
