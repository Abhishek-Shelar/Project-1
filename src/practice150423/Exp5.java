package practice150423;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to print current URL & close the application
public class Exp5 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	driver.close();
}
}
