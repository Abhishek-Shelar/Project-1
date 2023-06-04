package practice150423;
//to open google & maximize & close browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp7 {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(5000);
driver.manage().window().maximize();
Thread.sleep(5000);
driver.manage().window().minimize();
Thread.sleep(5000);
driver.close();

	}

}
