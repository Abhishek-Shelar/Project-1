package practice200423;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to open the chrome -facebook-maximize-enter-username-enter password-close
public class Exp1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//to enter the value in username
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("abhishek");
		//to enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abhishek");
	}

}
