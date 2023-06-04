package practice150423;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.ThreadDeathWatcher;

//to maximaize the  browsing winds
public class Exp6 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
     driver.manage().window().maximize();
     Thread.sleep(5000);
     driver.close();
	
}
}
