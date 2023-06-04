package prctice210423;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//xpath by text method
public class EXP4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");                 //................to open facebook
	Thread.sleep(5000);
	driver.manage().window().maximize();
	//to click forgot password link by text method
	//tagname[@text()='text value']
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	Thread.sleep(5000);
	//to click login botton
	//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.close();
}
}
