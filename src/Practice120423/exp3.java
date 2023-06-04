package Practice120423;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp3 {
	//to open the browser facebook
	public static void main(String[] args) {
		WebDriver Abhishek=new ChromeDriver();
		Abhishek.get("https://www.facebook.com/");
	     Abhishek.close();
	}
	

}
