package practice050523;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to open the fb & click on the new account
public class Example3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
    Thread.sleep(5000);
    //to click on the new creat account
    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    
}
}
