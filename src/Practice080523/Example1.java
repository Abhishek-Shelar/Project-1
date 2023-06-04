package Practice080523;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// xpath by partial text value
public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		//to open the facebook
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//to open new account by xpath by partially text value
		driver.findElement(By.xpath("//a[contains(text(),'Create new ')]")).click();
	}

}
