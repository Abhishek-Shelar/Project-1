package practice150423;

import org.asynchttpclient.filter.ThrottleRequestFilter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to open google & then open facebook then back-foeward-refresh-back-minimize-close
public class Exp11 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	Thread.sleep(5000);
	driver.close();
	
	}
}
