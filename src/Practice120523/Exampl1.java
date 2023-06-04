package Practice120523;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Xpath by contains by text path
public class Exampl1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//to enter the username by xpath by contain attribute method
		//driver.findElement(By.xpath("//input[contains(@class,'inputtext _5')][1]")).sendKeys("9096018067");//first method
		//to enter the username & password xpath  by contains method
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("9096018067");
		Thread.sleep(5000);
		//to enter the password by xpath contain text method
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("9096018067");
		//to click on login page by contain xpath method
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
	}

}
