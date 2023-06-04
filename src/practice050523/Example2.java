package practice050523;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to open facebook & click on the forgot password button by xpath by text method
public class Example2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	//to hit on the forgot password button by xpath by text method
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
}
}
