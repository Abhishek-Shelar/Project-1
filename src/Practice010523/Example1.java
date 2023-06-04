package Practice010523;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to open the facebook by attribute method
public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		//to open the facebook
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		//to enter the username & passward by xpath by attribute method
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("9096018067");
		Thread.sleep(5000);
		//to enter the password
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("9096018067");
		Thread.sleep(5000);
		//to click on the login button
		driver.findElement(By.xpath("//div[@class=\"x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1\"][1]")).click();
	}

}
