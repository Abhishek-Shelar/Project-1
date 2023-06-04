package practice150423;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to get the current url

public class exp4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.close();
		}

}
