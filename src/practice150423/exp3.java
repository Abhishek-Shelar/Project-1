package practice150423;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//by using edge browswe to open facebook & also print the url
public class exp3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.close();
	}

}
