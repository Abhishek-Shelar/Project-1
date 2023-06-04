package Practice010523;
//using navigate to oprn url & forward & backward // refresh

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().refresh();
	
	}

}
