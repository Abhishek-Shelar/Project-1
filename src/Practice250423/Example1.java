package Practice250423;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//xpath by text method

public class Example1 {
	//to open FB and click on login button
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//xpath by attribute method
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
