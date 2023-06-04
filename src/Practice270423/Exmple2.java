package Practice270423;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to open the facebook by xpath by text method also to click the forgot password button 
public class Exmple2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abshelar54@gamil.com");   //to enter username
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9nq0 textPadding20px _4jy3 _4jy1 selected _51sy']")).click();
		
	}

}
