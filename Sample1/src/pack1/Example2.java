package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	


	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		   
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		     	

	}

}
