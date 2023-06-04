package practice050523;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to open Facebook and used xpath by attribute & Xpath by text method
public class Example1 {
	public static void main(String[] args) {
		//to open the face book
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		//to enter the username by xpath by attribute method
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9096018067");
		//to enter the password by xpath by attribute method
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9096018067");
		//to hit on the login button by xpath by text method
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
