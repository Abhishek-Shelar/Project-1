package Practice010523;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//xpath by text method
//to open the facebook click on the forgot button then close & again the click on the create new account
public class Example5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//a[text='Forgotten password?']")).click();
		//Thread.sleep(5000);
		//driver.close();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
