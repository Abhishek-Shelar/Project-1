package Practice270423;
//to open facebook by xpath by attribute method

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//to enter value in username
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("abshelar54@gmail.com");
		//to enter the password
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("9096018067");
	}

}
