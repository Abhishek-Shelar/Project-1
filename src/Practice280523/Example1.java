package Practice280523;
//to open the face book application...................and to print the current URL

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();              //webdriver method
		driver.get("https://www.facebook.com/");          //to enter the URL
		Thread.sleep(2000);                                //get time after the page load
		driver.manage().window().maximize();               //maximize the current web page
		
		String titel = driver.getCurrentUrl();             //to geyt the current URL
		System.out.println(titel);
		driver.close();                                     // to close the tab
	}

}
