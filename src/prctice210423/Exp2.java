package prctice210423;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//xpath by attributemethod
public class Exp2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");                              //to open url
	Thread.sleep(2000);
	//to enter Username
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abshelar");
	Thread.sleep(2000);
	//to enter the passward
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9096018067");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	//to enter the click on login button
	driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	Thread.sleep(5000);
	driver.close();
	

}
}
