package Practice120423;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp2 {
	//another example to open the google 
	public static void main(String[] args) {
		WebDriver abhishek=new ChromeDriver();
		abhishek.get("https://www.google.com/");
	}

}
